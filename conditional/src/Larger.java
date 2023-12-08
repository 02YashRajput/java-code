import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number: ");
            int a = sc.nextInt();

            System.out.println("Enter a number: ");
            int b = sc.nextInt();

            if(a>b){
                System.out.println(a + "is greater than " + b);
                 if (a %2 == 0){
                System.out.println(a + " is even.");

            }else{
                
                System.out.println(a + " is odd.");

                
            }    
            }else{
                System.out.println(b + "is greater than " + a);

                if (a %2 == 0){
                    System.out.println(b + " is even.");
    
                }else{
                    
                    System.out.println(b + " is odd.");
    
                    
                }    
            }

        }
    }
}
