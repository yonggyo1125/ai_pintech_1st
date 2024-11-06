package org.koreait.exam01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex01 {

    private Connection conn;

    @BeforeAll
    static void setup() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    @BeforeEach
    void init() throws Exception {
        // JDBC - Java DataBase Connectivity
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        conn = DriverManager.getConnection(url, "spring6", "oracle");
    }

    @AfterEach
    void close() throws Exception {
        conn.close();
    }

}
