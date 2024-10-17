package exam05;

import java.util.Objects;

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
    public boolean equals(Object obj) {

        if (obj instanceof Customer customer) {
            // id, name, email이 같으면 동등하다.
           if (id == customer.id && name.equals(customer.name) && email.equals(customer.email)) {
               return true;
           }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
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