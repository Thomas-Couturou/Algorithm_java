package com.algo.leetcode;

public class Problem686_Repeated_String_Match {
    public static int repeatedStringMatch(String a, String b) {
        int result = 1;
        String repeatA = a;
        while(repeatA.length() < b.length()){
            repeatA += a;
            result++;
        }
        if(repeatA.contains(b)){
            return result;
        }
        repeatA += a;
        result++;
        if(repeatA.contains(b)){
            return result;
        }
        return -1;
    }
}
