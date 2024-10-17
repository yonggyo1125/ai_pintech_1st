package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");

            fis.close();
            System.out.println("자원 해제!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
