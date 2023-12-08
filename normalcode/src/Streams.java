import java.util.*;
import java.util.stream.Stream;
public class Streams {
public static void main(String[] args){
	// List<Integer> l1 = new ArrayList<Integer>();	
    // l1.add(10);
    // l1.add(20);
    // l1.add(30);
    // System.out.println(l1);
    List<Integer> l2 = Arrays.asList(12,2,26,14,5,9);
    // for(Integer e : l2){
    //     System.out.println(e);
    // }
    // l1.forEach(n -> System.out.println(n));
    // Stream<Integer> s =l2.stream();
    Stream<Integer> s =l2.stream().sorted().filter(n->n%2==0); //method chaining


    s.forEach(n->System.out.println(n));
    // Stream<Integer> s1 =s.sorted();

    // System.out.println(s.count());
    // s1.forEach(n->System.out.print(n+ " "));

    // Stream<Integer> s2 = s1.map(n->n*2);

    // Stream<Integer> s2 = s1.filter(n->n%2==0);

    // s2.forEach(n->System.out.print(n+ " "));
	}
}


