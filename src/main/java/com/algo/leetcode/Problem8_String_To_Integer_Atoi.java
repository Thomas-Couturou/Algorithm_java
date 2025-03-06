package com.algo.leetcode;

public class Problem8_String_To_Integer_Atoi {
    public static int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        long result = 0;
        boolean isNegative = false;
        while (i<n && s.charAt(i)== ' '){
            i++;
        }
        if (i<n && s.charAt(i)== '-'){
            isNegative = true;
            i++;
        }
        else if(i<n && s.charAt(i)== '+'){
            i++;
        }
        while (i<n && s.charAt(i)== '0'){
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            result = 10*result + Integer.parseInt(s.substring(i,i+1));
            if(isNegative && -result < Integer.MIN_VALUE){
                result = Integer.MIN_VALUE;
                break;
            }
            else if(!isNegative && result > Integer.MAX_VALUE){
                result = Integer.MAX_VALUE;
                break;
            }
            i++;
        }
        if (isNegative){
            result = -result;
        }
        return (int) result;
    }
}
