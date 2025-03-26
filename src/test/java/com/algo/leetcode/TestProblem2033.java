package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2033 {
    @Test
    public void testProblem2033(){
        assertEquals(Problem2033_Minimum_Operations_to_Make_a_Uni_Value_Grid.minOperations(new int[][]{{2,4},{6,8}}, 2), 4);
        assertEquals(Problem2033_Minimum_Operations_to_Make_a_Uni_Value_Grid.minOperations(new int[][]{{1,5},{2,3}}, 1), 5);
        assertEquals(Problem2033_Minimum_Operations_to_Make_a_Uni_Value_Grid.minOperations(new int[][]{{1,2},{3,4}}, 2), -1);
    }
}
