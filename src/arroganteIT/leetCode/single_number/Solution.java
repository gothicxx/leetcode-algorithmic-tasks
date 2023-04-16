package arroganteIT.leetCode.single_number;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};

        int result = singleNumber1(nums);

        System.out.println(result);
    }

    // O(N)
    public static int singleNumber1(int[] nums) {

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    // O(NlogN)
    public static int singleNumber2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], value);
        }

        int resultIndex = 0;

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == 1) {
                resultIndex = pair.getKey();
                break;
            }
        }

        return resultIndex;
    }
}
