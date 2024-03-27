package Exercise;

import java.util.*;

public class circumference {
   public static double RadiusCicle(int a) {
      double circumference = (6.28 * a);
      return circumference;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      System.out.println("The Circumference is: " + RadiusCicle(a));
   }
}
