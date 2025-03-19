package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem3191 {
    @Test
    public void testProblem3191(){
        assertEquals(Problem3191_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I.minOperations(new int[] {0, 1, 1, 1, 0, 0}), 3);
        assertEquals(Problem3191_Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I.minOperations(new int[] {0, 1, 1, 1}), -1);
    }
}
