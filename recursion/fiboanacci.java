package recursion;

public class fiboanacci {

   public static void printFibo(int n, int m, int sum) {
      if (sum == 0) {
         return;
      }
      int c = n + m;

      System.out.print(c + " ");
      printFibo(m, c, sum - 1);
   }

   public static void main(String[] args) {
      int n = 0;
      int m = 1;
      System.out.println(n);
      System.out.println(m);
      int sum = 7;
      printFibo(n, m, sum - 2);
   }
}
