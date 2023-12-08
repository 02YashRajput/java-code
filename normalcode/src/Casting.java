public class Casting {
    public static void main(String[] args) {
        int a = 9;
        double b = 8.5d; 
    
        System.out.println(a);      
        System.out.println(b);
        double c = a; //widening me extra kuch nahi lagana padta
        int  d= (int)b; // narrowing me jis me bhi badalna hai wo lagan padta hai
        System.out.println(c);
        System.out.println(d);
    }
}
