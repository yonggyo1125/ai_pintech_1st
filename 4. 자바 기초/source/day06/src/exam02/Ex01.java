package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Animal tiger = new Tiger(); // Tiger, Animal
        tiger.move();

        Animal bird = new Bird(); // Bird, Animal
        bird.move();

        Animal human = new Human(); // Human, Animal
        human.move();

    }
}
