package exam02;

import java.io.Serializable;

public class Person implements Serializable { // 마커 인터페이스

    private static final long serialVersionUID = 1000L;

    private String name;
    private transient int age; // transient - 직렬화 배제

    private String job;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("name2=%s, age=%d%n", name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
