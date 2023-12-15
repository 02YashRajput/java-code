import java.util.ArrayDeque;

public class Array_deque {
    public static void main(String[] args) {
        ArrayDeque arr = new ArrayDeque();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);
        arr.addFirst(1);//first par add karna efficient nahi hai
        arr.addLast(1);
        System.out.println(arr);



        


        
    }
}
