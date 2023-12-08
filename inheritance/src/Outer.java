
public class Outer {
    int a =5;
    class Inner{
        int b = 4;
        public int myMethod(){
            return a;
        }
    }
    public static void main(String[] args) {
        Outer myObj1 = new Outer();
        Outer.Inner myObj2 = myObj1.new Inner();
        System.out.println(myObj1.a+myObj2.b);
        System.out.println(myObj2.myMethod());
    }
}
