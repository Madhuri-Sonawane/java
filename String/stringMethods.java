package String;

import java.util.*;

import Function.name;

public class stringMethods {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String Name1 = "Hello";
      String Name2 = "Robin";
      System.out.println(Name1);
      System.out.println(Name2);

      // concetenation

      String concete = Name1 + " " + Name2;
      System.out.println(concete);

      // lenght
      System.out.println("The Length of Concete String is: " + concete.length());

      // CharArt

      for (int i = 0; i < concete.length(); i++) {
         System.out.println(concete.charAt(i));
      }

      // compare string

      if (Name1.compareTo(Name2) == 0) {
         System.out.println("Both Are Equal");
      } else if (Name1.compareTo(Name2) < 0) {
         System.out.println("Name1 is Less Than Name2");
      } else {
         System.out.println("Both Are Not Equal");
      }

   }
}
