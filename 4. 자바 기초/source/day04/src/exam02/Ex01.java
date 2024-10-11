package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "이이름";
        s1.major = "영어";
        s1.showInfo();

        System.out.println("s1:" + System.identityHashCode(s1));

        s1 = null; // null - 값이 없는 상태

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.major = "수학";
        s2.showInfo();

        System.out.println("s2:" + System.identityHashCode(s2));

        Student s3 = s2;
        s3.name = "(수정)김이름";
        s3.showInfo();
        s2.showInfo();

        System.out.println("s1, s2 주소 : " + (s1 == s2));
        System.out.println("s2, s3 주소 : " + (s2 == s3));
    }
}
