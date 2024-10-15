package exam02;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두발로 직립보행!");
    }

    public void reading() {
        System.out.println("독서한다.");
    }

    /*
    @Override
    public void move() {
        //super.move(); // Animal의 move();
        //
        System.out.println("두발로 직립보행!");
    }*/

}
