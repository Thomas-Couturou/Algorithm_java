package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem398 {
    @Test
    public void testProblem398(){
        Problem398_Random_Pick_Index problem398 = new Problem398_Random_Pick_Index(new int[]{1,2,3,3,3});
        assertTrue(problem398.pick(3) == 2 || problem398.pick(3) == 3 || problem398.pick(3) == 4);
        assertEquals(problem398.pick(1), 0);
        assertTrue(problem398.pick(3) == 2 || problem398.pick(3) == 3 || problem398.pick(3) == 4);
    }
}
