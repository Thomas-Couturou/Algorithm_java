package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2379 {
    @Test
    public void testProblem2379(){
        assertEquals(Problem2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks.minimumRecolors("WBBWWBBWBW", 7), 3);
        assertEquals(Problem2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks.minimumRecolors("WBWBBBW", 2), 0);
    }
}
