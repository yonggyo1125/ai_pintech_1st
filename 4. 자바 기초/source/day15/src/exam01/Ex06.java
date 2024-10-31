package exam01;

public class Ex06 {
    public static void main(String[] args) {
        UniqueList<String> items = new UniqueList<>();
        items.add("이름1");
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        System.out.println(items);
    }
}
