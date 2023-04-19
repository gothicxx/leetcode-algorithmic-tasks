package arroganteIT.leetCode.two_sum;

import java.util.Arrays;

public class Solution {

    // test
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3,2,4};
        System.out.println(Arrays.toString(solution.twoSum(nums, 6))); // expected: [1, 2]
    }

    public int[] twoSum(int[] nums, int target) {
        int value1 = 0;
        int value2 = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int check = nums[i] + nums[j];
                if (check == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
