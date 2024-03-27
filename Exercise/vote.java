package Exercise;

import java.util.*;

public class vote {
   public static void VoteAge(int a) {
      if (a >= 18) {
         System.out.println("You can Vote");
      } else {
         System.out.println("You Cannot Vote.");
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      VoteAge(a);
   }
}
