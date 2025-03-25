package com.algo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem56_Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        for(int[] interval: intervals){
            if(interval[0] <= currentInterval[1]){
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                result.add(currentInterval);
                currentInterval = interval;
            }
        }
        result.add(currentInterval);
        return result.toArray(new int[result.size()][]);
    }
}
