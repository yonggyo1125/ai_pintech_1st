package org.koreait.exam01;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.sql.Connection;
import java.sql.SQLException;

public class Ex02 {


    @Test
    @DisplayName("Tomcat JDBC를 이용한 커넥션 테스트")
    void test1() {
        DataSource ds = new DataSource();
        /* 연결 설정 S */
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("spring6");
        ds.setPassword("oracle");
        /* 연결 설정 E */

        /* 커넥션 풀 설정 S */
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);  // 유휴 커넥션 객체 테스트
        ds.setTimeBetweenEvictionRunsMillis(10 * 1000); // 10초 간격으로 유휴 커넥션 연결 상태 체크
        ds.setMinEvictableIdleTimeMillis(50 * 1000); // 50초가 지난 유휴 객체 소멸, 새로 생성
        /* 커넥션 풀 설정 E */

        try (Connection conn = ds.getConnection()) {
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("HikariCP 이용한 커넥션 테스트")
    void test2() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
        config.setUsername("spring6");
        config.setPassword("oracle");

        HikariDataSource ds = new HikariDataSource(config);
        try (Connection conn = ds.getConnection()) {

            System.out.println(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
