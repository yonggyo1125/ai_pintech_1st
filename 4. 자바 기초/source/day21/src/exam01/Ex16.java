package exam01;

import java.io.PrintStream;

public class Ex16 {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("error.log");
        System.setErr(ps);

        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2;
    }
}
