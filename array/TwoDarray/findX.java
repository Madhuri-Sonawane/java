package array.TwoDarray;

import java.util.*;

public class findX {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int rows = sc.nextInt();
      int columns = sc.nextInt();

      int[][] numbers = new int[rows][columns];

      // for input
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            numbers[i][j] = sc.nextInt();
         }
      }

      int x = sc.nextInt();

      // for output
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            if (numbers[i][j] == x) {
               System.out.print("The X found at:" + "( " + i + " , " + j + " )");
            }
         }
         System.out.println();
      }

   }
}
