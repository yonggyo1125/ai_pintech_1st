package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.setItem(new Apple());

        System.out.println(box); //box.toString()

        ///Box<Toy> toyBox = new Box<>();
    }
}
