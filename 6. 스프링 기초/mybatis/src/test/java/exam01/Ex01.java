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

import java.sql.Connection;
import java.util.List;

@SpringJUnitConfig
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    @Autowired
    private SqlSessionFactory sessionFactory;

    @Autowired
    private BoardMapper boardMapper;

    @Test
    void test1() {
        SqlSession session = sessionFactory.openSession(); // auto commit - false
        // JDBC API를 직접 사용할때
        /**
         * Statement
         * PreparedStatement
         * CallableStatement
         */
        Connection con = session.getConnection();
        System.out.println(con);

        //session.commit();

    }

    @Test
    void test2() {
        List<Board> items = boardMapper.getList();
        items.forEach(System.out::println);
    }
}
