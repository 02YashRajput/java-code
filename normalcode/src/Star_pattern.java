

public class Star_pattern {
    public static void main(String[] args) {
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0;i<4;i++){
            for(int j = 0;j <i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0;i<4;i++){
            for (int t = 0;t < 3-i;t++){
                System.out.print(" ");
            }
            for(int j = 0;j <2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
