
import java.io.*;
public class FileHandling2 {
    public static void main(String[] args)  throws IOException{
        File dir = new File("IOJava");
        System.out.println(dir.exists());
        dir.mkdirs();  // to make a directory

        File file = new File(dir, "temp.txt");
        file.createNewFile();    // to create a file 
        System.out.println(file.exists());


        String[] strArr = dir.list();
        int count = 0;


        for(String name:strArr){
            count ++;
            System.out.println(name);
        }
        System.out.println(count);

        
    }
}
