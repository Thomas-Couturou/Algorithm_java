package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem1346 {
    @Test
    public void testProblem1346() {
        assertTrue(Problem1346_Check_If_N_And_Its_Double_Exist.checkIfExist(new int[] {10, 2, 5, 3}));
        assertFalse(Problem1346_Check_If_N_And_Its_Double_Exist.checkIfExist(new int[] {3, 1, 7, 11}));
    }
}
