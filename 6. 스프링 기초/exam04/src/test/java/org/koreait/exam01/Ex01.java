package org.koreait.exam01;

import org.junit.jupiter.api.BeforeAll;

public class Ex01 {

    @BeforeAll
    static void setup() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }


}
