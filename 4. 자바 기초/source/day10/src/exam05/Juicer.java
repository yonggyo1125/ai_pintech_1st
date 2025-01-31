package exam05;

import java.util.List;

public class Juicer {

    // ? - Apple, Grape, Fruit
    public static void make(FruitBox<? extends Fruit> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make3(FruitBox<T> fruitBox) {

    }

    // Apple, Fruit, Object
    public static void make2(FruitBox<? super Apple> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    /*
    public static void make(FruitBox<Apple> appleBox) {
        List<Apple> items = appleBox.getItems();
        System.out.println(items);
    }
    */
    /* 메서드 중복 정의, 정의 불가
    public static void make(FruitBox<Grape> grapeBox) {
        List<Grape> items = grapeBox.getItems();
        System.out.println(items);
    } */
}
