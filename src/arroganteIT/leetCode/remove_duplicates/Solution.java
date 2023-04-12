package arroganteIT.leetCode.remove_duplicates;

import java.util.LinkedHashSet;

public class Solution {
    public static int removeDuplicates1(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] local = new int[set.size()];

        int c = 0;
        for(Integer el : set) {
            local[c] = el;
            c++;
        }

        for (int i = 0; i < local.length; i++) {
            nums[i] = local[i];
        }

        return local.length;
    }
}
