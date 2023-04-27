package arroganteIT.leetCode.addDigits;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int addDigits(int num) {
        String strNum = "" + num;
        ArrayList<String> splited = new ArrayList<String>(Arrays.asList(strNum.split("")));
        ArrayList<Integer> nums = new ArrayList<>();
        // ArrayList<Integer> result = new ArrayList<>();
        int[] result = new int[100];
        for(String el : splited) {
            nums.add(Integer.parseInt(el));
        }
        for(int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                result[i] += nums.get(j);
            }
        }
        //////////////
        String strNum2 = "" + result[0];
        ArrayList<String> splited2 = new ArrayList<String>(Arrays.asList(strNum2.split("")));
        ArrayList<Integer> nums2 = new ArrayList<>();
        int[] result2 = new int[100];
        for(String el : splited2) {
            nums2.add(Integer.parseInt(el));
        }
        for(int i = 0; i < result2.length; i++) {
            for (int j = 0; j < nums2.size(); j++) {
                result2[i] += nums2.get(j);
            }
        }
        if (result2[0] > 10) {
            String strNum3 = "" + result2[0];
            ArrayList<String> splited3 = new ArrayList<String>(Arrays.asList(strNum3.split("")));
            ArrayList<Integer> nums3 = new ArrayList<>();
            int[] result3 = new int[100];
            for(String el : splited3) {
                nums3.add(Integer.parseInt(el));
            }
            for(int i = 0; i < result3.length; i++) {
                for (int j = 0; j < nums3.size(); j++) {
                    result3[i] += nums3.get(j);
                }
            }
            return result3[0];

        } else if (result2[0] % 10 == 0) {

            return result2[0] / 10;
        }else {
            return result2[0];
        }
    }
}
