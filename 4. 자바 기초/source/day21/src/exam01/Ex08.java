package exam01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex08 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("hello2.txt")) {
            fw.write("안녕하세요.");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
