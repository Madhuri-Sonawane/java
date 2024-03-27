package recursion;

import java.util.Scanner;

public class factorial {

   public static int printFactorial(int n) {
      if (n == 1 || n == 0) {
         return 1;
      }
      int factorial = printFactorial(n - 1);
      int fact = n * factorial;

      return fact;
   }

   public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // int n = sc.nextInt();

      int n = 5;
      int ans = printFactorial(n);
      System.out.println(ans);

   }
}
