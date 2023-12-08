class Car implements Runnable{
    synchronized public void run(){
        try{
        System.out.println(Thread.currentThread().getName()+ " has entered the car.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+ " go to car to drive.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+ " comes back and parks the car.");
        Thread.sleep(1000);

       

        }catch(InterruptedException e){
            System.out.println("Something went Wrong!");
        }

    }
}
public class Threads3 {
    public static void main(String[] args) {
        Car car = new Car();
        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);
        t1.setName("Yash");
        t2.setName("Utkal");
        t3.setName("Ujjwal");
        t1.start();
        t2.start();
        t3.start();
    }
}
