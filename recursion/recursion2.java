//for write a number from 1 to 5

package recursion;

public class recursion2 {

   public static void printNumb(int n) {
      if (n == 6) {
         return;
      }
      System.out.print(n + " ");
      printNumb(n + 1);
   }

   public static void main(String[] args) {
      int n = 1;
      printNumb(n);

   }

}
