public class Constructor {
    // int a;
    // public Constructor(){
    //     a = 5;

    // }
    // public static void main(String[] args) {
    //     Constructor myObj = new Constructor();
    //     System.out.println(myObj.a);
    // }
    int x;

    public Constructor(int y) {//parametrised constructor
      x = y;
    }
  
    public static void main(String[] args) {
      Constructor myObj = new Constructor(5);
      System.out.println(myObj.x);
    }
}
