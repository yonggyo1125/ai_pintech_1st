package exam01;

import java.util.function.BiPredicate;

public class Ex05 {
    public static void main(String[] args) {
        BiPredicate<String, String> cond1 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> cond2 = String::equals;

        // 순서가 반대이므로 메서드 참조 불가!
        BiPredicate<String, String> cond3 = (s1, s2) -> s2.equals(s1);

    }
}
