package exam04;

public class Ex04 {
    public static void main(String[] args) {
        String transStr = "BUS";

        Transportation trans = Enum.valueOf(Transportation.class, transStr);
        System.out.println(trans);
        System.out.println(trans instanceof Transportation);

    }
}
