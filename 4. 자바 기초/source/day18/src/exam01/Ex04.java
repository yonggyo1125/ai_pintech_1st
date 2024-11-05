package exam01;

import java.util.List;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        List<String> items2 = List.of("항목1", "항목1", "항목1", "항목2", "항목3", "항목4", "항목5");

        Stream<String> stm = items2.stream().distinct().map(s -> String.format("**%s**", s));
        // 중간 연산

       List<String> cItems2 = stm.toList();  // 최종 연산 - 실제 연산이 수행되는 메서드
        // 최종 연산이 호출되면, 중간 연산에 명시된 각 메서드 작업이 시작, 수행, 최종 연산 마무리 후 결과 값 나온다.
        System.out.println(cItems2);
    }
}
