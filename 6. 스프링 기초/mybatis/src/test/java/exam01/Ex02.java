package exam01;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.koreait.board.entities.Board;
import org.koreait.config.AppCtx;
import org.koreait.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig
@ContextConfiguration(classes = AppCtx.class)
public class Ex02 {

    @Autowired
    private SqlSessionFactory sessionFactory;

    @Autowired
    private BoardMapper boardMapper;

    @Test
    void test1() {
        SqlSession session = sessionFactory.openSession();
        Board board = new Board();
        board.setSubject("%제목%");
        List<Board> items = session.selectList("org.koreait.mapper.BoardMapper.getList3", board);
        System.out.println(items);
    }

    @Test
    void test2() {
        Board board = new Board();
        board.setSubject("%제목%");
        List<Board> items = boardMapper.getList3(board);
        System.out.println(items);
    }
}
