import java.util.Scanner;

public class Sumuser {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int a = sc.nextInt();
            System.out.println("Enter another number:");
            int b = sc.nextInt();
            System.out.println("Sum of two numbers: " + (a+b));
            System.out.println("Differnce of two numbers: " + (a-b));
        }
        

    }
}
