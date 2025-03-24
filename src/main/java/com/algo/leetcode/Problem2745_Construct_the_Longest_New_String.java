package com.algo.leetcode;

public class Problem2745_Construct_the_Longest_New_String {
    public static int longestString(int x, int y, int z) {
        if( x == y){
            return 4*x + 2*z;
        }
        return 2*(2*Math.min(x,y) +1 + z);
    }
}
