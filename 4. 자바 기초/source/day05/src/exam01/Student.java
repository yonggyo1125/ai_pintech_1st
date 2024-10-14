package exam01;

public class Student {
    int id; // 학번
    String name; // 학생명
    String major; // 전공

    public Student() {}

    void showInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
    }
}
