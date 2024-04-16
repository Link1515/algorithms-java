package sort;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) throws Exception {
    int[] nums = { 2, 34, 22, 23, 99, 34, 55 };
    bubbleSort(nums);

    System.out.println(Arrays.toString(nums));
  }

  public static void bubbleSort(int[] nums) {
    for (int i = nums.length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (nums[j] > nums[j + 1]) {
          swap(nums, j, j + 1);
        }
      }
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
