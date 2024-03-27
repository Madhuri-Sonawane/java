package sortingMethods;

public class selections {

   public static void printArray(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {

      // selection sorting method

      int arr[] = { 8, 9, 3, 4, 5, 7, 2, 1, 6, 10 };

      // outer loop
      for (int i = 0; i < arr.length - 1; i++) {

         // store smallest index in variable
         int smallest = i;

         // inner loop
         for (int j = i + 1; j < arr.length; j++) {

            if (arr[smallest] > arr[j]) {
               smallest = j;

            }

         }
         int temp = arr[smallest];
         arr[smallest] = arr[i];
         arr[i] = temp;
         // System.out.print(arr[i] + " ");
      }

      printArray(arr);
   }
}
