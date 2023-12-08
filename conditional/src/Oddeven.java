import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number: ");
            int a = sc.nextInt();

            if (a %2 == 0){
                System.out.println(a + " is even.");

            }else{
                
                System.out.println(a + " is odd.");

            }
        }
    }
}
