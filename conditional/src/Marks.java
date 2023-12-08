import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your marks: ");
            int m = sc.nextInt();
            if (m > 90){
                System.out.println("Your grade is A");

            }else if(m>80){
                
                System.out.println("Your grade is B");

            }else if(m>70){
                
                System.out.println("Your grade is C");

            }else if(m>60){
                
                System.out.println("Your grade is D");

            }else if(m>50){
                
                System.out.println("Your grade is E");

            }else {
                
                System.out.println("Your grade is F");

            }
        }

    }
}
