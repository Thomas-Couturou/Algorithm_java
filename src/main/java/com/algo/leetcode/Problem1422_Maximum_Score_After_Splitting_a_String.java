package com.algo.leetcode;

public class Problem1422_Maximum_Score_After_Splitting_a_String {
    public static int maxScore(String s) {
        int right_one = 0;
        int max_score;
        for (int i=1; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                right_one ++;
            }
        }
        max_score = right_one;
        int left_zero = 0;
        if(s.charAt(0) == '0'){
            left_zero ++;
            max_score = Math.max(max_score, left_zero + right_one);
        }
        for(int i=1; i<s.length()-1; i++){
            if(s.charAt(i) == '0'){
                left_zero ++;
                max_score = Math.max(max_score, left_zero + right_one);
            }
            else{
                right_one --;
            }
        }
        return max_score;
    }
}
