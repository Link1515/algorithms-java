public class BubbleSort {
  public static void main(String[] args) throws Exception {
    int[] arr = { 2, 34, 22, 23, 99, 34, 55 };

    for (int i = 0; i < arr.length - 1; i++) {
      boolean isFinish = true;

      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          isFinish = false;
        }
      }

      if (isFinish) {
        break;
      }
    }

    printArr(arr);
  }

  private static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + (i == arr.length - 1 ? "\n" : ", "));
    }

  }
}
