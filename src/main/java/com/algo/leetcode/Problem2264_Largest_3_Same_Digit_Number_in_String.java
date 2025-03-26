package com.algo.leetcode;

public class Problem2264_Largest_3_Same_Digit_Number_in_String {
    public static String largestGoodInteger(String num) {
        int i = 0;
        int n = num.length();
        String result = "";
        while(i <n){
            char c = num.charAt(i);
            String temp = "";
            temp += c;
            i++;
            while (i < n && num.charAt(i) == c && temp.length() < 3){
                temp += c;
                i++;
            }
            if(temp.length() == 3 && (result.equals("") || c > result.charAt(0)))
            {
                result = temp;
            }
        }
        return result;
    }
}
