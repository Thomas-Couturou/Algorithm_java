package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem3396 {
    @Test
    public void testProblem3396(){
        assertEquals(Problem3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct.minimumOperations(new int[]{1,2,3,4,2,3,3,5,7}), 2);
        assertEquals(Problem3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct.minimumOperations(new int[]{4,5,6,4,4}), 2);
        assertEquals(Problem3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct.minimumOperations(new int[]{6,7,8,9}), 0);
    }
}
