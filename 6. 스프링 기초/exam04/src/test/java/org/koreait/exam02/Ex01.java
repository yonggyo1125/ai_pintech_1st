package org.koreait.exam02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Transactional
@SpringJUnitConfig
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    @DisplayName("INSERT 쿼리 테스트")
    void test1() {
        String sql = "INSERT INTO MEMBER (SEQ, EMAIL, PASSWORD, USERNAME) VALUES (MEMBER_SEQ.nextval, ?, ?, ?)";
        int affectedRows = jdbcTemplate.update(sql, "user99@test.org", "123456", "사용자99");
        System.out.println(affectedRows);

    }
    
    @Test
    @DisplayName("UPDATE 쿼리 테스트")
    void test2() {
        String sql = "UPDATE MEMBER SET USERNAME=? WHERE EMAIL LIKE 'user%'";
        int affectedRows = jdbcTemplate.update(sql, "(수정)사용자명");
        System.out.println(affectedRows);
    }

    @Test
    @DisplayName("SELECT 쿼리 테스트 - 전체 목록")
    void test3() {
        String sql = "SELECT * FROM MEMBER WHERE USERNAME LIKE ?";
        List<Member> members = jdbcTemplate.query(sql, this::mapper, "%수정%");

        members.forEach(System.out::println);
    }

    @Test
    @DisplayName("SELECT 쿼리 - 단일 조회")
    void test4() {
        try {
            String sql = "SELECT * FROM MEMBER WHERE EMAIL LIKE ?";
            Member item = jdbcTemplate.queryForObject(sql, this::mapper, "%user%");
            System.out.println(item);
        } catch (DataAccessException e) {
            System.out.println("데이터 없음");
        }
    }

    @Test
    @DisplayName("단일 데이터 조회 - 사용명")
    void test5() {
        String sql = "SELECT USERNAME FROM MEMBER WHERE EMAIL='user03@test.org'";
        String username = jdbcTemplate.queryForObject(sql, String.class);
        System.out.println(username);

        String sql2 = "SELECT COUNT(*) FROM MEMBER";
        long total = jdbcTemplate.queryForObject(sql2, long.class);
        System.out.println(total);
    }

    private Member mapper(ResultSet rs, int i) throws SQLException {
        Member member = new Member();
        member.setSeq(rs.getLong("SEQ"));
        member.setEmail(rs.getString("EMAIL"));
        member.setPassword(rs.getString("PASSWORD"));
        member.setUsername(rs.getString("USERNAME"));
        member.setRegdt(rs.getTimestamp("regdt").toLocalDateTime());

        Timestamp modDt = rs.getTimestamp("moddt");
        if (modDt != null) {
            member.setModdt(modDt.toLocalDateTime());
        }

        return member;
    }
}
