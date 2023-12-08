import java.io.*;
class Cricketer implements Serializable {
    private String name;
    private int age;
    private int runs;
    Cricketer(String name, int age, int runs){
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
    public String toString(){
        return name + " " + age + " " + runs ;
     }
}
public class Seri {
    public static void main(String[] args) throws IOException{
        Cricketer cr = new Cricketer("Rohit Shrama", 33,10000);
        FileOutputStream fos = new FileOutputStream("Java.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cr);
        oos.flush();
        oos.close();
    }
    
}
