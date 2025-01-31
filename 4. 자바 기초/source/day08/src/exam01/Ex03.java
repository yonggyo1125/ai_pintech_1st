package exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("b.txt");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 예외가 있던 없던 항상 처리하는 자원 해제

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("자원 해제!");
        }
    }
}
