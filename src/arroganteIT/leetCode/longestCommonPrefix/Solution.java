package arroganteIT.leetCode.longestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"a"};
        String[] strs4 = {"", ""};
        String[] strs5 = {"flower", "flower", "flower", "flower"};
        System.out.println(solution.longestCommonPrefix(strs3));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int counter = 0;

        String smallest = strs[0];
        String largest = strs[strs.length - 1];

        for (int i = 0; i < smallest.length(); i++) {
            if(smallest.charAt(counter) == largest.charAt(counter)) {
                counter++;
            }
        }

        return smallest.substring(0, counter);
    }
}
