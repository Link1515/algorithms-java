public class BinarySearch {

  public static void main(String[] args) throws Exception {
    int[] nums = { 2, 5, 8, 23, 32, 69, 79, 98, 105 };
    int target = 23;

    int targetIndex = binarySearch(nums, target);
    System.out.println(targetIndex);
  }

  public static int binarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (nums[mid] > target) {
        right = mid - 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        return mid;
      }
    }

    return -1;
  }
}
