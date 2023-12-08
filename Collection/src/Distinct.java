import java.util.*;
public class Distinct {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,2,1,4,6,2,5,7};
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            // System.out.println(e.getKey()+ " "+ e.getValue());
            if(e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
}
}
