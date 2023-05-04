package arroganteIT.leetCode.mergeSortedArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        new Solution().merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0, j = m; i < n; i++) {
            nums1[j++] = nums2[i];
        }

        Arrays.sort(nums1);

        print(nums1);
    }

    public static void print(int[] arr) {
        for(int el : arr) {
            System.out.print(el + " ");
        }
    }
}
