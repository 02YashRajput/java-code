class outer{
    void show(){
        System.out.println("inside outer");
    }
    class inner{
        void display(){
            System.out.println("inside inner");
        }
    }
}



public class innerouter {
    public static void main(String[] args) {
        
        outer ob = new outer();
        ob.show();
        // outer.inner ob1 = new outer.inner(); 
        outer.inner ob1 = ob.new inner();
        ob1.display();
    }
}
