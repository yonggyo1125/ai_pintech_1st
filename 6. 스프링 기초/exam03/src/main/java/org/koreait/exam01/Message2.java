package org.koreait.exam01;

// 변경 불가한 라이브러리 클래스라고 가정하고 만들고 있다!
// InitializingBean, DisposableBean을 정의하지 못하는 상황이라고 가정!
public class Message2 {

    public void init() {
        System.out.println("init() 호출!");
    }

    public void close() {
        System.out.println("close() 호출!");
    }

    public void send(String message) {
        System.out.printf("메세지:%s, 전송 완료!%n", message);
    }
}
