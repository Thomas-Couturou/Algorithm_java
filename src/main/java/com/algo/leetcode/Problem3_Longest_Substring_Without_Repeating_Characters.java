package com.algo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem3_Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length;
        int init_index = 0;
        Map<Character, Integer> vu = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            Character c = s.charAt(i);
            if (vu.containsKey(c)){
                length = i - init_index;
                if (length > maxLength ){
                    maxLength = length;
                }
                if (vu.get(c) + 1 > init_index){
                    init_index = vu.get(c) + 1 ;
                }
            }
            vu.put(c , i);
        }
        length = s.length() - init_index ;
        if (length > maxLength ){
            maxLength = length;
        }
        return maxLength;
    }
}
