package exam01;

import java.io.File;

public class Ex18 {
    public static void main(String[] args) throws Exception {
        //File file = new File("D:/temp.log");
        //file.createNewFile();

        File dir = new File("D:/");
        File tmpFile = File.createTempFile("temp", ".log", dir);
        tmpFile.deleteOnExit();

        Thread.sleep(5000); // 5초 지연
    }
}
