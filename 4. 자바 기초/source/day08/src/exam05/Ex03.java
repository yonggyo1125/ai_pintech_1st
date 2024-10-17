package exam05;

public class Ex03 {
    public static void main(String[] args) {
        Customer2 c1 = new Customer2(1000, "이이름", "user01@test.org");

        System.out.printf("id=%d, name=%s, email=%s%n", c1.id(), c1.name(), c1.email());
        System.out.println(c1); // c1.toString();
    }
}
