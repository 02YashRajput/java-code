
import java.io.*;
public class FIleHAndling4 {
    public static void main(String[] args) throws IOException {
        File dir = new File("JavaDemo");
        File file = new File(dir,"wData.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter br = new BufferedWriter(fw);
        br.write("Java");
        br.flush();
        br.write("\nJava");
        br.flush();
        br.write("\nJava");
        br.flush();
        br.write("\nJava");
        br.flush();
        br.close();

    }
}
