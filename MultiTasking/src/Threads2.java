import java.io.IOException;

class ThreadDemo implements Runnable {
    public void run() {
        System.out.println("Inside Thread1...");
    }
}
public class Threads2 {
    public static void main(String[] args) throws InterruptedException {     

        ThreadDemo demo = new ThreadDemo();
        Thread t1 = new Thread(demo);
        System.out.println(t1.isAlive());
        t1.start();
        t1.join();
        System.out.println(t1.isAlive());

    }
    
}
