package com.algo.leetcode;

public class Problem14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        Character next;
        boolean same = true;
        int i = 0;
        int n = minLength(strs);
        while(i<n && same){
            next = strs[0].charAt(i);
            for (String str: strs){
                if (str.charAt(i) != next){
                    same = false;
                    break;
                }
            }
            if (same){
                result = result + next;
            }
            i++;
        }
        return result;
    }

    private static int minLength(String[] strs){
        int result = strs[0].length();
        for (String str : strs){
            if (str.length() < result){
                result = str.length();
            }
        }
        return result;
    }
}
