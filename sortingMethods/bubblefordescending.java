package sortingMethods;

public class bubblefordescending {

   public static void printArray(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      int arr[] = { 8, 6, 3, 4, 7, 5, 1, 9, 2, 52, 59, 15 };

      // bubble sort for descending method
      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr.length - i - 1; j++) {

            // for descending order just reverse the if statement condition

            if (arr[j] < arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }
      printArray(arr);
   }
}
