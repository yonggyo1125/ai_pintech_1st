package org.koreait.exam01;

import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() 호출!");
    }

    public void send(String message) {
        System.out.printf("메세지:%s, 전송 완료!%n", message);
    }
}