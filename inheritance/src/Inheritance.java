
class Inheritance {
    protected int a =5;
    public int myMethod (int b){
        return b*2;
    }
class In extends Inheritance{
    public static void main(String[] args) {
        Inheritance myObj1 = new Inheritance();
        System.out.println(myObj1.a);
        System.out.println(myObj1.myMethod(2));
    }
}
    
}