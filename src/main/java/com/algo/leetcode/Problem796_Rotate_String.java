package com.algo.leetcode;

public class Problem796_Rotate_String {
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.equals(goal)){
                return true;
            }
            s = s.substring(1) + s.substring(0,1);
        }
        return s.equals(goal);
    }
}
