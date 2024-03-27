package Function;

import java.util.*;

public class product {
   public static int CalculteProduct(int a, int b) {
      return a * b;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println("The Product of " + a + " and " + b + " is: " + CalculteProduct(a, b));
   }
}
