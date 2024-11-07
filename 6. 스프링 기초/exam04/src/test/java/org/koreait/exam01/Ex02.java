package org.koreait.exam01;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import java.sql.Connection;
import java.sql.SQLException;

public class Ex02 {


    @BeforeEach
    void init() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:XE");
        ds.setUsername("spring6");
        ds.setPassword("oracle");

        try (Connection conn = ds.getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
