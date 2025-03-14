package com.algo.leetcode;

public class Problem2078_Two_Furthest_Houses_With_Different_Colors {
    public static int maxDistance(int[] colors) {
        int max = 0;
        for(int i=0; i<colors.length - 1; i++){
            for(int j=colors.length - 1; j>i; j--){
                if(colors[i] != colors[j]){
                    if(j-i > max){
                        max = j-i;
                    }
                    break;
                }
            }
        }
        return max;
    }
}
