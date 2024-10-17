package exam05;

public class Customer extends java.lang.Object {
    private int id; // 고객 번호
    private String name; // 고객명
    private String email; // 이메일

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}