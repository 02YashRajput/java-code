import java.util.*;

class Student1<T>{
    T obj;
    public Student1(T obj){
        this.obj = obj;
    }
    public T set(T obj){
        this.obj = obj;
        return obj;
    }
    public T getObj(){
        return obj;
    }
    void display(){
        System.out.println(obj);
    }
    public String toString(){
        return obj.toString();
    }
}



public class Generics2 {

    public static void main(String[] args) {
        Student1 s1 = new Student1("yash");

        ArrayList<Student1> l1 = new ArrayList<Student1>();
        l1.add(s1);
        System.out.println(l1);
    }
}
