package arroganteIT.leetCode.validPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String trimed =  s.replaceAll("\\s", "");
        trimed = trimed.replaceAll("[^a-zA-Z0-9_-]", "");
        trimed = trimed.replaceAll("\\_","");
        trimed = trimed.replaceAll("\\--","");
        trimed = trimed.replaceAll("\\-","");
        char[] chars = trimed.toCharArray();
        char[] reversedchars = new char[chars.length];

        int count = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedchars[count] = chars[i];
            count++;
        }

        String reversed = reversedchars.toString();
        int counter = 0;
        for(int i = 0; i < chars.length; i++) {
            if (reversedchars[i] == chars[i]) {
                counter++;
            }
        }

        if (counter == chars.length) {
            return true;
        }else {
            return false;
        }

    }
}
