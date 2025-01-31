package exam03;

public class DuckContainer {
    public Fly fly() {
        return new Fly();
    }

    public Quackable quackable() {
        return new Quack();
    }

    public LayEggs layEggs() {
        return new LayEggs();
    }

    public Swim swim() {
        return swim();
    }

    public RocketDuck rocketDuck() {
        return new RocketDuck(fly());
    }

    public RubberDuck rubberDuck() {
        return new RubberDuck(quackable(), swim());
    }
}
