public class Recursion {
    public static int sum(int k) {
      if (k == 0) {
        return 0;
      } else {
        return  k + sum(k - 1);
      }
    }
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
      }
}
