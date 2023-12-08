
import java.io.*;
public class FileHandling3 {
    public static void main(String[] args) throws IOException {
        File dir = new File("JavaDemo");
        dir.mkdirs();


        File file = new File(dir,"wData.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.write("Yash Rajput");
        fw.close();


        FileReader fr = new FileReader(file);
        System.out.println((char)fr.read());
        fr.close();

    }
}
