package arroganteIT.leetCode.lengthOfLastWord;

public class Solution {
    public static int lengthOfLastWord(String s) {
        String[] array = s.split(" ");

        String lastWord = array[array.length - 1];

        return lastWord.length();
    }
}
