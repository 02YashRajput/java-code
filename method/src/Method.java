class Method {
    static void myMethod1() {
        System.out.println("I just got executed!");
      }
    static void myMethod2(String fname) {
        System.out.println(fname + " Refsnes");
    }
    static void myMethod3(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    static int myMethod4(int x) {
        return 5 + x;
    }
    public static void main(String[] args) {
        myMethod1();
        myMethod2("fxgffc");
        myMethod3("Liam", 5);
        System.out.println(myMethod4(5));

    }
}
