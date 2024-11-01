package exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");
        members.put("user04", "사용자04");

        Set<Map.Entry<String, String>> entries = members.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }

        for (Map.Entry<String, String> entry : members.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }
    }
}
