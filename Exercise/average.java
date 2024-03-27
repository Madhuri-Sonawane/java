package Exercise;

import java.util.*;

public class average {
   public static void PrintAverage(int a, int b, int c) {
      int average = (a + b + c) / 3;
      System.out.println(average);
      return;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.print("The Average Of " + a + " and " + b + " and " + c + " is: ");
      PrintAverage(a, b, c);

   }

}
