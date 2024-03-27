package array;

import java.util.*;

public class findxarray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int[] number = new int[size];

      // for input

      for (int i = 0; i < size; i++) {
         number[i] = sc.nextInt();
      }

      int x = sc.nextInt();

      // for output

      for (int i = 0; i < size; i++) {
         if (number[i] == x) {
            System.out.println("The X found At: " + i);
         } else {
            System.out.println("Number is Invalid");
         }
      }

   }
}
