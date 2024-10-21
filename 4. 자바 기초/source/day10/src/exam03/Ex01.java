package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());

        Apple apple = (Apple)appleBox.getItem(); // 형변환의 번거로움
        System.out.println(apple.info());

        Box grapeBox = new Box();
        grapeBox.setItem(new Grape());

        Grape grape = (Grape)grapeBox.getItem(); // 형변환의 번거로움
        System.out.println(grape.info());
    }
}
