package exam02;

public class Ex03 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        System.out.println(System.identityHashCode(sb));

        sb.append("ABC");
        System.out.println(System.identityHashCode(sb));

        sb.append("DEF");
        System.out.println(System.identityHashCode(sb));

        sb.append("GHI");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString();
        System.out.println(str);
        System.out.println(System.identityHashCode(str));

        String str2 = "ABCDEFGHI";
        System.out.println("str2 주소:" + System.identityHashCode(str2));

        System.out.printf("str == str2:%s%n", str == str2); // 지양 - 동일성
        System.out.printf("str.equals(str2):%s%n", str.equals(str2)); // 바람직 - 동등성
    }
}
