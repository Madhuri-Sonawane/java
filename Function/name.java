package Function;

import java.util.*;

public class name {
   public static void PrintMyName(String name) {
      System.out.println(name);
      return;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      System.out.println("The Given Name is: " + name);
   }
}
