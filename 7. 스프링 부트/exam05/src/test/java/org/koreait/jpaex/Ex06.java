package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.board.entities2.Board;
import org.koreait.board.entities2.BoardData;
import org.koreait.board.repositories.BoardDataRepository;
import org.koreait.board.repositories.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ActiveProfiles({"default", "test"})
@Transactional
public class Ex06 {
    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardDataRepository boardDataRepository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        Board board = new Board();
        board.setBid("freetalk");
        board.setBname("자유게시판");
        boardRepository.saveAndFlush(board);

        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            BoardData item = new BoardData();
            item.setBoard(board);
            item.setSubject("제목" + i);
            item.setContent("내용" + i);
            items.add(item);
        }

        boardDataRepository.saveAllAndFlush(items);

        em.clear();
    }

    @Test
    void test1() {
        // 게시글 1번 조회 후 게시판 설정도 함께 조회 - @ManyToOne
        BoardData item = boardDataRepository.findById(1L).orElse(null);
        System.out.println(item);

        Board board = item.getBoard();

        System.out.println(board);
    }

    @Test
    void test2() {
        Board board = boardRepository.findById("freetalk").orElse(null);
        List<BoardData> items = board.getItems();
        items.forEach(System.out::println);
    }
}
