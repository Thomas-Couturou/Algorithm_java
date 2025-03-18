package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1422 {
    @Test
    public void testProblem1422(){
        assertEquals(Problem1422_Maximum_Score_After_Splitting_a_String.maxScore("011101"), 5);
        assertEquals(Problem1422_Maximum_Score_After_Splitting_a_String.maxScore("00111"), 5);
        assertEquals(Problem1422_Maximum_Score_After_Splitting_a_String.maxScore("1111"), 3);
    }
}
