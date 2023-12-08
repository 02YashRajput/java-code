import java.util.Scanner;

public class Cuboiduser {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter length: ");
            int l = sc.nextInt();
            System.out.println("Enter width: ");
            int b = sc.nextInt();
            System.out.println("Enter height: ");
            int h = sc.nextInt();
            System.out.println("Area of cuboid: "+ 2*(l*b + b*h + l*h) );
            System.out.println("Perimeter of cuboid: " +  4*(l+b+h));
            System.out.println("Volume of cuboid: " +  (l*b*h));

        }
    }
}
