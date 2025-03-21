package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2965 {
    @Test
    public void testProblem2965(){
        int[] result = Problem2965_Find_Missing_and_Repeated_Values.findMissingAndRepeatedValues(new int[][]{{1,3},{2,2}});
        assertEquals(result[0], 2);
        assertEquals(result[1], 4);
    }

    @Test
    public void testProblem2965_2(){
        int[] result = Problem2965_Find_Missing_and_Repeated_Values.findMissingAndRepeatedValues(new int[][]{{9,1,7},{8,9,2},{3,4,6}});
        assertEquals(result[0], 9);
        assertEquals(result[1], 5);
    }
}
