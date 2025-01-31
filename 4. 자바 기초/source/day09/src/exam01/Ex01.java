package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex01 {
    public static void main(String[] args) {
        Class<Person> cls = Person.class;

        System.out.println("---- 생성자 -----");
        /*
        for (Constructor constructor : cls.getConstructors()) {
            System.out.println(constructor);
        }
        */
        for (Constructor constructor : cls.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        System.out.println("---- 멤버 변수 ----");
        /*
        for (Field field : cls.getFields()) {
            System.out.println(field);
        }
        */
        for (Field field : cls.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("---- 메서드 ----");
        /*
        for (Method method : cls.getMethods()) {
            System.out.println(method);
        } */
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
