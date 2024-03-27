package recursion;

import java.util.Scanner;

import Function.sum;

public class sumOfNaturalNm {

   public static void sumNatural(int m, int n, int sum) {
      if (m == n) {
         sum += m;
         System.out.println(sum);
         return;
      }

      sum += m;
      sumNatural(m + 1, n, sum);
   }

   public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // int m = sc.nextInt();
      // int n = sc.nextInt();

      // sumNatural(m, n, 0);

      sumNatural(1, 5, 0);
   }
}
