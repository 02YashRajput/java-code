public class Override {
    int x = 10;
    // final int x = 10; ise lagane ke baad change nahi kar sakte
  public static void main(String[] args) {
    Override myObj = new Override();
    Override myObj1 = new Override();
    System.out.println(myObj.x);
    myObj.x = 25; 
    System.out.println(myObj.x);
    
    System.out.println(myObj1.x);
  }
}
