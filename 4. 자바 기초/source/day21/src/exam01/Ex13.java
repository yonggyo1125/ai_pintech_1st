package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13 {
    public static void main(String[] args) {
        int[] scores = { 90, 100, 80, 55, 70, 89 };

        try (FileOutputStream fos = new FileOutputStream("score.txt");
            DataOutputStream dos = new DataOutputStream(fos)) {

            for (int score : scores) {
                dos.writeInt(score);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
