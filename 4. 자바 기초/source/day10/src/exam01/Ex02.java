package exam01;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        // 문자열 -> Enum 상수 객체
        //Transportation trans = Enum.valueOf(Transportation.class, "SUBWAY");
        //System.out.println(trans);
        Transportation trans = Transportation.valueOf("SUBWAY");
        System.out.println(trans);

        // Transportation에 정의된 상수 목록
        Transportation[] items = Transportation.values();
        System.out.println(Arrays.toString(items));
    }
}
