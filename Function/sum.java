package Function;

import java.util.*;

public class sum {
   public static int CalculateSum(int a, int b) {
      return a + b;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println("The Sum Of " + a + " and " + b + " is: " + CalculateSum(a, b));
   }
}
