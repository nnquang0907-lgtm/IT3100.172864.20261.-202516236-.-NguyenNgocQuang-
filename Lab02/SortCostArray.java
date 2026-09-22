package Lab02;

public class SortCostArray {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
  }
    public static void main(String[] args) {
      int arr[] = {1789, 2035, 1899, 1456, 2013};
      bubbleSort(arr);
      int sum = 0;
      System.out.print("Sorted array of media costs: ");
      for (int i=0;i<arr.length; i++){
        System.out.print(arr[i] + " ");
        sum += arr[i];
      }
      System.out.println("\nSum = " + sum);
      int average = sum/arr.length;
      System.out.print("Average = " + average);
    }
}
