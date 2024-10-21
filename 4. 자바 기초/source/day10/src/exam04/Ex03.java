package exam04;

public class Ex03 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(); // Fruit & Eatable
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.setItem(new Grape());
        fruitBox.setItem(new Apple());

        //Box<Grape> grapeBox = new Box<>(); // Fruit
    }
}
