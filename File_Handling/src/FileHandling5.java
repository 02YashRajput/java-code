
import java.io.*;
public class FileHandling5 {
    public static void main(String[] args) throws IOException {
        File dir = new File("JavaDemo");
        File file = new File(dir,"wData.txt");
        FileReader reader = new FileReader(file );
        BufferedReader br = new BufferedReader(reader);
        String line = br.readLine();
        while(line!=null){

            System.out.println(line);
            line = br.readLine();
        }

    }
}