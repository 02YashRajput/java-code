import java.util.*;

class Student1{
    private String name;
    private int id;

    public Student1(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return name+" "+id;
    }
    

}

class Employee1{
    private String name;
    private int id;
    public Employee1(String name,int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return name+" "+id;
    }
}


public class Generics1 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Yash");
        l1.add("Rajput");
        System.out.println(l1);
        // l1.add(1);     cannot add any other data types.
        
        ArrayList<Integer> l2 = new ArrayList<>(); //cannot use primitive types here.
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2);
        

        
        Student1 s1 = new Student1("Yash Rajput",01);
        Student1 s2 = new Student1("Ram",02);
        Employee1 e1 = new Employee1("Uttkal",03);

        ArrayList<Student1> l3 = new ArrayList<>(); //cannot use primitive types here.
        l3.add(s1);
        l3.add(s2);
        System.out.println(l3);
        ArrayList<Employee1> l4 = new ArrayList<>();
        l4.add(e1);
        System.out.println(l4);
        
        
        
        
        
        ArrayDeque<String> d1 = new ArrayDeque<>();
        d1.add("Yash");
        d1.add("Rajput");
        // a1.add(2);     cannot add any other data types.
        System.out.println(d1);

    }
}
