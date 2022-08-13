public class TwoSum {
  public static void main(String[] args) {
    int[] nums = new int[] { 1, 2, 3, 4 };
    int target = 5;
    int[] ans = twoSum(nums, target);
    System.out.println("[" + ans[0] + "," + ans[1] + "]");
  }

  public static int[] twoSum(int[] nums, int target) {
    int diff;
    int[] result = new int[] { 0, 0 };

    for (int i = 0; i < nums.length; i++) {
      diff = target - nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (diff == nums[j]) {
          result[0] = i;
          result[1] = j;

          return result;
        }
      }
    }
    return result;
  }

}
