package uk.leetCode.palindrom_number;

class Solution {
    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        char[] splited = xString.toCharArray();

        String reversed = "";
        for (int i = 0; i < splited.length; i++) {
            reversed = reversed
                    .concat(String.valueOf(splited[splited.length - 1 - i]));
        }

        return xString.equals(reversed);
    }
}