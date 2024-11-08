package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("obj2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Map<String, Object> data = new HashMap<>();
            Person p1 = new Person("이이름", 40);
            data.put("p1", p1);

            Person p2 = new Person("김이름", 30);
            data.put("p2", p2);

            data.put("message", "안녕하세요.");

            oos.writeObject(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
