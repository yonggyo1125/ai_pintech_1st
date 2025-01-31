package exam02;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Class<Student> cls = Student.class;
        // 클래스 위에 적용된 애노테이션 정보 S
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);
        String[] value = myAnno.value();
        System.out.println(Arrays.toString(value));
        int min = myAnno.min();
        int max = myAnno.max();
        System.out.printf("min=%d, max=%d%n", min, max);
        // 클래스 위에 적용된 애노테이션 정보 E

        // 메서드 위에 적용된 애노테이션 정보 S
        Method method = cls.getDeclaredMethod("study");
        MyAnno myAnno2 = method.getAnnotation(MyAnno.class);
        String[] value2 = myAnno2.value();
        System.out.println(Arrays.toString(value2));
        int min2 = myAnno2.min();
        int max2 = myAnno2.max();
        System.out.printf("min=%d, max=%d%n", min2, max2);
        // 메서드 위에 적용된 애노테이션 정보 E
    }
}
