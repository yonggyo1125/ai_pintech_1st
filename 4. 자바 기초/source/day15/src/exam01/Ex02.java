package exam01;

import java.util.LinkedList;
import java.util.Queue;

public class Ex02 {
    public static void main(String[] args) {
        Queue<String> items = new LinkedList<>();
        items.offer("항목1");
        items.offer("항목2");
        items.offer("항목3");
        items.offer("항목4");
        items.offer("항목5");


        while(items.size() > 0) {
            String item = items.poll(); // 첫번째 요소 꺼내기
            System.out.println(item);
        }

    }
}
