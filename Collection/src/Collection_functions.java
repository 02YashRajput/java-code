import java.util.*;
public class Collection_functions {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(40);
        num.add(50);
        num.add(20);
        num.add(30);
        System.out.println(num);

        Collections.sort(num);
        System.out.println(num);

        System.out.println("Index is " + Collections.binarySearch(num,30));
        
        Collections.rotate(num,1);
        System.out.println(num);
        
        System.out.println("Frequency is " + Collections.frequency(num,30));

        Collections.shuffle(num);
        System.out.println(num);

        


    }
}
