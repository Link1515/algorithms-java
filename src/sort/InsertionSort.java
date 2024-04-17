package sort;

import java.util.Arrays;

// 從左往右整理，右邊進來的數字插入到正確的位置
public class InsertionSort {

  public static void main(String[] args) {
    int[] nums = { 2, 34, 22, 23, 99, 34, 55 };
    insertionSort(nums);

    System.out.println(Arrays.toString(nums));
  }

  public static void insertionSort(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      int temp = nums[i];

      for (int j = i; j > 0; j--) {
        if (nums[j - 1] > temp) {
          swap(nums, j, j - 1);
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
