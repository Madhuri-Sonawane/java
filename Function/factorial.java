package Function;

import java.util.*;

public class factorial {
   public static void printFactorial(int n) {

      if (n < 0) {
         System.out.println("Invalid Number");
         return;
      }

      int factorial = 1;
      for (int i = 1; i <= n; i++) {
         factorial = factorial * i;
      }
      System.out.println(factorial);
      return;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      System.out.println("The factorial of " + n + " is: ");
      printFactorial(n);
   }
}
