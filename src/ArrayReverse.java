import java.util.Arrays;

public class ArrayReverse {

  public static void main(String[] args) throws Exception {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    arrayReverse(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void arrayReverse(int[] nums) {
    for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
  }
}
