package exam01;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex09 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("hello3.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw)) {

            bw.write("안녕하세요.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
