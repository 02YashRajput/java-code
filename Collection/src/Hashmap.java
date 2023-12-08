import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Yash");
        hm.put(2,"Yash");
        hm.put(3,"Yash");
        hm.put(4,"Yash");
        hm.put(5,"Yash");
        hm.put(6,"Yash");
        for(Map.Entry<Integer,String> e:hm.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());
        }
    }
}
