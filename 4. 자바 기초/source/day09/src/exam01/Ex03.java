package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        Class<Person> cls = Person.class;

        Constructor con = cls.getDeclaredConstructor();
        Object obj = con.newInstance();

        Method m1 = cls.getDeclaredMethod("setAge", int.class);
        Object r1 = m1.invoke(obj, 20);
        System.out.println(r1);

        Method m2 = cls.getDeclaredMethod("getAge");
        Object r2 = m2.invoke(obj);
        int age = (int)r2;
        System.out.println(age);
        System.out.println(obj);
    }
}
