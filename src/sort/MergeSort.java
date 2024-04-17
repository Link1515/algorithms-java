package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 陣列持續切半，直到只剩一個元素，隨後進行合併
public class MergeSort {

  public static void main(String[] args) {
    List<Integer> sortedNums = mergeSort(Arrays.asList(3, 2, 6, 9, 3));
    System.out.println(sortedNums);
  }

  public static List<Integer> mergeSort(List<Integer> nums) {
    if (nums.size() == 1) {
      return nums;
    }
    int mid = nums.size() / 2;
    List<Integer> leftHalfNums = new ArrayList<>(nums.subList(0, mid));
    List<Integer> rightHalfNums = new ArrayList<>(
      nums.subList(mid, nums.size())
    );

    return mergeTwoSortedArr(mergeSort(leftHalfNums), mergeSort(rightHalfNums));
  }

  public static List<Integer> mergeTwoSortedArr(
    List<Integer> list1,
    List<Integer> list2
  ) {
    ArrayList<Integer> result = new ArrayList<>();

    while (list1.size() > 0 && list2.size() > 0) {
      if (list1.get(0) < list2.get(0)) {
        result.add(list1.remove(0));
      } else {
        result.add(list2.remove(0));
      }
    }

    if (list1.size() > 0) {
      result.addAll(list1);
    }

    if (list2.size() > 0) {
      result.addAll(list2);
    }

    return result;
  }
}
