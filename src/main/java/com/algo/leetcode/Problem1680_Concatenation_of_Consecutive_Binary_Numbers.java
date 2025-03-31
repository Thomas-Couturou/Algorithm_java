package com.algo.leetcode;

import java.util.LinkedList;

public class Problem1680_Concatenation_of_Consecutive_Binary_Numbers {
    public static int concatenatedBinary(int n) {
        int result = 0;
        for (int i=1; i<=n; i++){
            int value = i;
            LinkedList<Integer> binary = new LinkedList<>();
            while (value>0){
                binary.addFirst(value%2);
                value = value/2;
            }
            while(!binary.isEmpty()){
                result = (2*result + binary.poll())%1000000007;
            }
        }
        return result;
    }
}
