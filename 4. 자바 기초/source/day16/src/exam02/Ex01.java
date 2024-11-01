package exam02;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        Map<String, String> members = new HashMap<>();
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");
        members.put("user04", "사용자04");

        members.put("user01", "사용자99");

        System.out.println(members);
        members.remove("user02");
        String userName02 = members.get("user02");
        System.out.println(userName02);
    }
}
