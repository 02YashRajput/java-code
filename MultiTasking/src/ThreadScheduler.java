import java.util.Scanner;

class Mythread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Thread.");
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
            System.out.println("Inside Thread1.");
        }
    } 
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Inside Thread2.");
    } 
}
public class ThreadScheduler {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        // t1.run();
        // t2.run();

        t1.start();
        
        t2.start();
        


    }
}
