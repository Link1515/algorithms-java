package sort;

import java.util.Arrays;

// 從左到右，找到最小往前放
public class SelectionSort {

  public static void main(String[] args) {
    int[] nums = new int[] { 7, 3, 2, 9, 4 };
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void selectionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int min = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[min]) {
          min = j;
        }
      }

      swap(nums, i, min);
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
