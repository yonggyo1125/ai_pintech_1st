package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {
            byte[] buffer = new byte[5];

            while(fis.available() > 0) {
                int value = fis.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    System.out.print((char)buffer[i]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
