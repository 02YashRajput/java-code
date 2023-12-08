

import java.util.Scanner;

public class Prime {
    public static Boolean prime(int n){
        for (int i = 2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(n+" is prime: "+prime(n));
        }
    }
}
