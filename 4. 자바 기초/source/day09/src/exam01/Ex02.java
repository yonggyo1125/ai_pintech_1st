package exam01;

import java.lang.reflect.Constructor;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Class<Person> cls = Person.class;
        Constructor defaultCon = cls.getDeclaredConstructor();

        // 기본 생성자로 객체 생성
        Person p1 = (Person)defaultCon.newInstance();
        System.out.println(p1);

        // 매개변수가 있는 생성자로 객체 생성
        Constructor paramCon = cls.getDeclaredConstructor(int.class, String.class);
        Person p2 = (Person)paramCon.newInstance(20, "이이름");
        System.out.println(p2);

        Object[] params = {30, "김이름"};
        Person p3 = (Person)paramCon.newInstance(params);
        System.out.println(p3);

    }
}
