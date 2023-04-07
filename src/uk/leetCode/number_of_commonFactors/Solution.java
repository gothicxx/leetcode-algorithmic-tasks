package uk.leetCode.number_of_commonFactors;

public class Solution {
    public static int commonFactor(int a, int b) {
        int factor = 0;
        int counter = 0;
        while (counter++ <= Math.min(a, b)) {
            if (a % counter == 0 && b % counter == 0) {
                factor++;
            }
        }
        return factor;
    }
}
