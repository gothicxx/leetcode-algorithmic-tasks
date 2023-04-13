package arroganteIT.leetCode.roman_to_integer;

class Solution {
    public static void main(String[] args) {

        // actual = 3065
        // expected = 3045
        System.out.println(romanToInt("MMMXLV"));

        //System.out.println(romanToInt("MCDLXXVI"));
        //System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int result = 0;

        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == 0 && chars[i] == 'M') {
                result = result + 1000;
            } else if (i == 0 && chars[i] == 'I') {
                result = result + 1;
            } else if (i == 0 && chars[i] == 'V') {
                result = result + 5;
            } else if (i == 0 && chars[i] == 'X') {
                result = result + 10;
            } else if (i == 0 && chars[i] == 'L') {
                result = result + 50;
            } else if (i == 0 && chars[i] == 'C') {
                result = result + 100;
            } else if (i == 0 && chars[i] == 'D') {
                result = result + 500;
            }else if (chars[i] == 'I') {
                result = result + 1;
            } else if (chars[i] == 'V' && chars[i - 1] != 'I') {
                result = result + 5;
            } else if (chars[i] == 'V' && chars[i - 1] == 'I') {
                result = result + 4;
                i = i - 1;
            } else if (chars[i] == 'X' && chars[i - 1] != 'I') {
                result = result + 10;
            } else if (chars[i] == 'X' && chars[i - 1] == 'I') {
                result = result + 9;
                i = i - 1;
            } else if (chars[i] == 'C' && chars[i - 1] != 'X') {
                result = result + 100;
            } else if (chars[i] == 'C' && chars[i - 1] == 'X') {
                result = result + 90;
                i = i - 1;
            } else if (chars[i] == 'D' && chars[i - 1] == 'C') {
                result = result + 400;
                i = i - 1;
            } else if (chars[i] == 'D' && chars[i - 1] != 'C') {
                result = result + 500;
            } else if (chars[i] == 'M' && chars[i - 1] == 'C') {
                result = result + 900;
                i = i - 1;
            } else if (chars[i] == 'M' && chars[i - 1] != 'C') {
                result = result + 1000;
            }  else if (chars[i] == 'L' && chars[i - 1] == 'X') {
                result = result + 40;
                i = i - 1;
            } else if (chars[i] == 'L' && chars[i - 1] != 'X') {
                result = result + 50;
            }

        }
        return result;
    }
}
