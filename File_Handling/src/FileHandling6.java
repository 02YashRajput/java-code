
import java.io.*;
public class FileHandling6 {
    public static void main(String[] args) throws IOException {
        File dir = new File("JavaDemo");
        File file = new File(dir,"wData.txt");
        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(65);
        pw.println(65);
        pw.close();

    }
}
