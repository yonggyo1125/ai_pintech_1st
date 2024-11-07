package org.koreait.exam01;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class Ex03 {
    private Connection conn;

    @BeforeEach
    void init() throws Exception {
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

        conn = ds.getConnection();
    }

    @AfterEach
    void close() throws Exception {
        conn.close();
    }
}
