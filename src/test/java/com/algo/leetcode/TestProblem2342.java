package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2342 {
    @Test
    public void testProblem2342(){
        assertEquals(Problem2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits.maximumSum(new int[] {18, 43, 36, 13, 7}), 54);
        assertEquals(Problem2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits.maximumSum(new int[] {10, 12, 19, 14}), -1);
    }
}
