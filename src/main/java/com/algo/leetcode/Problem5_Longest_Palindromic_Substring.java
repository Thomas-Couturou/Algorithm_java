package com.algo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem5_Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {
        String result = s.substring(0,1);
        String sub;
        Map<Character, ArrayList<Integer>> vu = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            Character c = s.charAt(i);
            if (vu.containsKey(c)){
                for (int j : vu.get(c)){
                    sub = s.substring(j, i+1);
                    if (sub.length()>result.length() && isPalindromic(sub)){
                        result = sub;
                    }
                }
                vu.get(c).add(i);
            }
            else {
                vu.put(c , new ArrayList<>());
                vu.get(c).add(i);
            }
        }
        return result;
    }

    private static boolean isPalindromic(String s){
        int n = s.length();
        boolean isPalindromic = true;
        for (int i =0; i<n/2; i++){
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                isPalindromic = false;
                break;
            }
        }
        return isPalindromic;
    }
}
