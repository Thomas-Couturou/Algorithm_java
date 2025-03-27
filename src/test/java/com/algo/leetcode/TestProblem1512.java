package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1512 {
    @Test
    public void testProblem1512(){
        assertEquals(Problem1512_Number_of_Good_Pairs.numIdenticalPairs(new int[]{1,2,3,1,1,3}), 4);
        assertEquals(Problem1512_Number_of_Good_Pairs.numIdenticalPairs(new int[]{1,1,1,1}), 6);
        assertEquals(Problem1512_Number_of_Good_Pairs.numIdenticalPairs(new int[]{1,2,3}), 0);
    }
}
