package org.koreait.tests;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.FileProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"default", "test"})
@EnableConfigurationProperties(FileProperties.class)
public class Ex03 {

    @Autowired
    private FileProperties fileProperties;

    @Test
    void test1() {
        System.out.println(fileProperties);
    }
}
