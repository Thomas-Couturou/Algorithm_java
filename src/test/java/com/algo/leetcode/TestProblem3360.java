package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem3360 {
    @Test
    public void testProblem3360(){
        assertTrue(Problem3360_Stone_Removal_Game.canAliceWin(12));
        assertFalse(Problem3360_Stone_Removal_Game.canAliceWin(1));
    }
}
