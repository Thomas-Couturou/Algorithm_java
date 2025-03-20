package com.algo.leetcode;

public class Problem2269_Find_the_K_beauty_of_a_Number {
    public static int divisorSubstrings(int num, int k){
        String numStr = String.valueOf(num);
        int n = numStr.length();
        int result = 0;
        for(int i=0; i<n-k+1; i++){
            int subNum = Integer.parseInt(numStr.substring(i, i+k));
            if(subNum != 0 && num % subNum == 0){
                result++;
            }
        }
        return result;
    }
}
