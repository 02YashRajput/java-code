interface I1{
    void drive();
    default void run(){
        System.out.println("inside run");
        
    }
    static void fun(){
        System.out.println("inside fun");
    }
}
    
class AB implements I1{
    public void drive(){
        System.out.println("Driving");
    }

}


public class Interface1 {
    public static void main(String[] args) {
        AB myObj1 = new AB();
        myObj1.drive();
        myObj1.run();
        I1.fun();
        

    }
}
