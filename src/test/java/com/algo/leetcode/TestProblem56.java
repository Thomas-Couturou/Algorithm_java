package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem56 {
    @Test
    public void testProblem56(){
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] result = Problem56_Merge_Intervals.merge(intervals);
        int[][] expected = new int[][]{{1,6},{8,10},{15,18}};
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                assertEquals(result[i][j], expected[i][j]);
            }
        }
    }

    @Test
    public void testProblem56_2(){
        int[][] intervals = new int[][]{{1,4},{4,5}};
        int[][] result = Problem56_Merge_Intervals.merge(intervals);
        int[][] expected = new int[][]{{1,5}};
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                assertEquals(result[i][j], expected[i][j]);
            }
        }
    }
}
