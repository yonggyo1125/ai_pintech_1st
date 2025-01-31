package exam01;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        // Closeable, AutoCloseable
        try(FileInputStream fis = new FileInputStream("a.txt")) {

            //
            /*
            AutoCloseable closeable = fis;
            closeable.close();
            */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
