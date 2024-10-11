package exam02;

public class Student {
    int id; // 학번
    String name; // 학생명
    String major; // 전공과목

    /**
     * 따로 정의 하지 않으면 기본 생성되는 생성자
     * 디폴트 생성자
     */
    public Student() {}

    void showInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
    }
}
