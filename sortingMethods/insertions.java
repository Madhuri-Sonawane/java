package sortingMethods;

public class insertions {

   public static void printArray(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      int arr[] = { 1, 8, 7, 6, 4, 9, 3, 5, 10 };

      for (int i = 0; i < arr.length; i++) {

         int current = arr[i];
         int j = i - 1;
         while (j >= 0 && current < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
         }

         // placement
         arr[j + 1] = current;
      }
      printArray(arr);
   }
}
