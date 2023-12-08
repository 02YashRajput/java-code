
import java.util.Scanner;

class Mythread11 implements Runnable {
    public void run() {
        System.out.println("Inside Thread1. ");
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
                for(int i = 0; i < n; i++){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println("Danger is coming soon");
                    }
                    System.out.println(i);
                }
        }
        System.out.println("Thread1 finished.");
    }
}
class Mythread12 implements Runnable {
    public void run() {
        System.out.println("Insidee Thread2");

    }
}
public class RunInterface {
    public static void main(String[] args) {
        Mythread11 myObj1 = new Mythread11();
        Mythread12 myObj2 = new Mythread12();
        Thread t1 = new Thread(myObj1);
        Thread t2 = new Thread(myObj2);
        t1.start();
        t2.start();

    }
}
