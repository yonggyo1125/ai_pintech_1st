package exam03;

public class SimpleCalculator extends Calculator {

    public SimpleCalculator() {
        super();
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
