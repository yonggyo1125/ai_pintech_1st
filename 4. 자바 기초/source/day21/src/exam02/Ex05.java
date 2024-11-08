package exam02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fis = new FileInputStream("obj2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Map<String, Object> data = (Map<String, Object>) ois.readObject();

            String message = (String)data.get("message");
            Person p1 = (Person)data.get("p1");
            System.out.println(message);
            System.out.println(p1);
        }
    }
}
