public class Exception {
    public static void main(String[] args) {
    try{
        int a= 5;
        int b = 0;
        System.out.println(a/b);
    }
    catch(ArithmeticException e)
    // catch(ArrayIndexOutOfBoundsException e) ye error dega
    {
        System.out.println(e.getMessage());
    }finally{
        System.out.println("Program finished");
    }
}   
}

