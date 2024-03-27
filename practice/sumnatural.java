package practice;

import java.util.*;

public class sumnatural {

   public static void naturalNumber(int n) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
         sum = sum + i;
      }
      System.out.println(sum);
      return;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      System.out.print("The sun of " + n + " numbers is:");
      naturalNumber(n);

   }
}
