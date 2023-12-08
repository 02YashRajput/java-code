import java.util.*;

public class Array_List {
   
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.add(23);
        l1.add(78);
        l1.add("Yash");
        System.out.println(l1);
        l1.add(1,7.0);//kisi index par add karna efficient nahi hai
        System.out.println(l1);


        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(23);
        l2.add(78);
        System.out.println(l2);
        System.out.println(l2.size());


        l1.addAll(0,l2);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);



        int s1 = (int)l1.get(0);
        System.out.println(s1);


        System.out.println(l1.get(1));
        
    }
}
