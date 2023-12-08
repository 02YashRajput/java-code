import java.util.*;

public class Iter {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);


        // Iterator<Integer> it = num.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next()+" ");
        // }

        ListIterator<Integer> itr = num.listIterator(num.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }


    }
}
