public class BinarySearch {
  public static void main(String[] args) throws Exception {
    int[] arr = { 2, 5, 8, 23, 32, 69, 79, 98, 105 };

    int target = 105;

    int start = 0;
    int end = arr.length - 1;

    int targetIndex = -1;
    while (end > start) {
      int mid = (start + end) / 2;

      if (arr[mid] == target) {
        targetIndex = mid;
        break;
      } else if (arr[mid] > target) {
        end = mid - 1;
        if (end == 0 && target == arr[0]) {
          targetIndex = 0;
        }
      } else {
        start = mid + 1;
        if (start == arr.length - 1 && target == arr[arr.length - 1]) {
          targetIndex = arr.length - 1;
        }
      }
    }

    if (targetIndex >= 0) {
      System.out.println("Found target at: " + targetIndex);
    } else {
      System.out.println("Target not found");
    }
  }
}
