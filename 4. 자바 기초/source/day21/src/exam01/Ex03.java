package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {
            byte[] buffer = new byte[5];

            while(fis.available() > 0) {
                int value = fis.read(buffer);
                System.out.printf("읽어온 바이트:%d%n", value);
                //System.out.println(Arrays.toString(buffer));
                /*
                for (int i = 0; i < buffer.length; i++) {
                    System.out.print((char)buffer[i]);
                } */
                for (int i = 0; i < value; i++) {
                    System.out.print((char)buffer[i]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
