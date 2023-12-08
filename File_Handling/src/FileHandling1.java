
import java.io.*;

public class FileHandling1 {
public static void main(String[] args) throws IOException {
        File file = new File("Java.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());
        File dtr = new File("Java2");
        System.out.println(dtr.exists());
        dtr.mkdirs();
    }
}
