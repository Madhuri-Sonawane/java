package recursion;

public class printXpowerN {

   public static int printPower(int x, int n) {

      if (n == 0) {
         return 1;
      }

      if (x == 0) {
         return 0;
      }

      int multiple = printPower(x, n - 1);
      int multy = x * multiple;

      return multy;

   }

   public static void main(String[] args) {

      int x = 2;
      int n = 4;

      int ans = printPower(x, n);
      System.out.println(ans);

   }

}
