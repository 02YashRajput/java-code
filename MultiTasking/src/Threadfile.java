public class Threadfile {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("Thread name: "+name);
        
        int n =Thread.currentThread().getPriority();
        System.out.println("Thread priority: " +n);

        System.out.println();
        System.out.println("After CHange:");
        System.out.println();

        Thread.currentThread().setName("Yash");
        String name1 = Thread.currentThread().getName();
        System.out.println("Thread name: "+name1);

        Thread.currentThread().setPriority(1);
        int n1 =Thread.currentThread().getPriority();
        System.out.println("Thread priority: " +n1);
    }
}
