package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("b.txt")) {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                fos.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
