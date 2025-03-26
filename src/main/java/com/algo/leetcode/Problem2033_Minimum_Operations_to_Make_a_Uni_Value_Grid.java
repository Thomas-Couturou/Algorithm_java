package com.algo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem2033_Minimum_Operations_to_Make_a_Uni_Value_Grid {
    public static int minOperations(int[][] grid, int x) {
        List<Integer> values = new ArrayList<>();
        for(int[] row: grid){
            for(int value: row){
                values.add(value);
            }
        }
        values.sort((a, b) -> Integer.compare(a, b));
        int median = values.get(values.size() / 2);
        int operations = 0;
        for(int value: values){
            if(Math.abs(value - median) % x != 0){
                return -1;
            }
            operations += Math.abs(value - median) / x;
        }
        return operations;
    }
}
