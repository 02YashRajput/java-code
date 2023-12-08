interface I1{
    void drive();
}


public class Anonymous {
    public static void main(String[] args) {
        I1 ob = new I1() {
            public void drive(){
                System.out.println(" driving....  ");
            }
        }; 
        ob.drive();
    }    
}
