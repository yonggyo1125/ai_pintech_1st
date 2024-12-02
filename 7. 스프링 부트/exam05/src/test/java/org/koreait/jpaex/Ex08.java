package org.koreait.jpaex;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.board.entities2.Board;
import org.koreait.board.entities2.BoardData;
import org.koreait.board.entities2.HashTag;
import org.koreait.board.entities2.QBoardData;
import org.koreait.board.repositories.BoardDataRepository;
import org.koreait.board.repositories.BoardRepository;
import org.koreait.board.repositories.HashTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex08 {
    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardDataRepository boardDataRepository;

    @Autowired
    private HashTagRepository hashTagRepository;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private JPAQueryFactory factory;

    @BeforeEach
    void init() {
        List<HashTag> tags = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            HashTag tag = new HashTag();
            tag.setTag("태그" + i);
            tags.add(tag);
        }

        hashTagRepository.saveAllAndFlush(tags);

        Board board = new Board();
        board.setBid("freetalk");
        board.setBname("자유게시판");
        boardRepository.saveAndFlush(board);

        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            BoardData item = new BoardData();
            item.setBoard(board);
            item.setSubject("제목" + i);
            item.setContent("내용" + i);
            item.setTags(tags);
            items.add(item);
        }

        boardDataRepository.saveAllAndFlush(items);

        em.clear();
    }

    @Test
    void test1() {
        BoardData item = boardDataRepository.findById(1L).orElse(null);
        Board board = item.getBoard(); // 2차 쿼리 수행 X
        System.out.println(board.getBname()); // 2차 쿼리 수행 O
        // 실제 데이터를 사용할때
        //List<HashTag> tags = item.getTags();
        //tags.forEach(System.out::println);
    }

    @Test
    void test2() {
        List<BoardData> items = boardDataRepository.findAll();
        for (BoardData item : items) {
            Board board = item.getBoard();
            System.out.println(board.getBname()); // 게시판명
        }
    }

    @Test
    void test3() {
        List<BoardData> items = boardDataRepository.getItems();
        for (BoardData item : items) {
            String bName = item.getBoard().getBname(); // 2차 쿼리를 수행
            System.out.println(bName);
        }
    }

    @Test
    void test4() {
        // QueryDSL - fetchJoin()
        QBoardData boardData = QBoardData.boardData;
        List<BoardData> items = factory.selectFrom(boardData)
                .leftJoin(boardData.board)
                .fetchJoin()  // boardData.board를 처음부터 JOIN
                .leftJoin(boardData.member)
                .fetchJoin() // boardData.member를 처음부터 JOIN
                .fetch();


    }

    @Test
    void test5() {
        boardDataRepository.findBySubjectContaining("");
    }

    @Test
    void test6() {
        Board board = boardRepository.findById("freetalk").orElse(null);
        List<BoardData> items = board.getItems();
        items.remove(1);
        boardRepository.flush();
        boardDataRepository.flush();
        //boardRepository.delete(board);
        //boardRepository.flush();
    }
}
