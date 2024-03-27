package stringbuilder;

import java.util.*;

public class sb {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      StringBuilder sb = new StringBuilder("Tony");
      System.out.println(sb);

      // set char at index i
      sb.setCharAt(3, 'P');
      System.out.println(sb);

      // insert

      sb.insert(4, 's');
      System.out.println(sb);

      sb.delete(0, 2);
      System.out.println(sb);
   }
}
