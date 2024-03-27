package Exercise;

import java.util.*;

public class sumoddno {
   public static void SumOdd(int n) {
      int sum = 0;

      for (int i = 1; i <= n; i++) {
         if (i % 2 != 0) {
            sum = sum + i;
         }
      }
      System.out.println(sum);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("The Sum of odd no. is: ");

      SumOdd(n);
   }
}
