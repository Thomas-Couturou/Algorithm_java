package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2594 {
    @Test
    public void testProblem2594() {
        int[] ranks = new int[] {4, 2, 3, 1};
        assertEquals(Problem2594_Minimum_Time_to_Repair_Cars.repairCars(ranks, 10), 16);
    }

    @Test
    public void testProblem2594_2() {
        int[] ranks = new int[] {5, 1, 8};
        assertEquals(Problem2594_Minimum_Time_to_Repair_Cars.repairCars(ranks, 6), 16);
    }
}
