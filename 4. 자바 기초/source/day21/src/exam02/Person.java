package exam02;

import java.io.Serializable;

public class Person implements Serializable { // 마커 인터페이스
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("name=%s, age=%d%n", name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
