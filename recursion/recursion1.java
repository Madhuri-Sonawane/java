
//for wriye number from 5 to 1
package recursion;

public class recursion1 {

   public static void printNumb(int n) {
      if (n == 0) {
         return;
      }
      System.out.print(n + " ");

      printNumb(n - 1);
   }

   public static void main(String[] args) {
      int n = 10;
      printNumb(n);

   }

}
