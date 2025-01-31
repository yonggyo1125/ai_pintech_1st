package exam02;

public class Ex02 {
    public static void main(String[] args) {
        /*
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();  // Animal animals[0] = new Tiger();
        animals[1] = new Bird(); // Animal animals[1] = new Bird();
        animals[2] = new Human(); // Animal animals[2] = new Human();
        */
        Animal[] animals = {new Tiger(), new Bird(), new Human()};

        for (Animal animal : animals) { // 업 캐스팅
            animal.move();
            if (animal instanceof Human) {
                Human human = (Human) animal; // 다운 캐스팅
                human.reading();
            } else if (animal instanceof Bird bird) {
                bird.singing();
            } else if (animal instanceof Tiger tiger) {
                tiger.hunting();
            }
        }
    }
}
