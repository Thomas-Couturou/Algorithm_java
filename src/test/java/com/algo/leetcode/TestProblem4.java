package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem4 {
    @Test
    public void testProblem4(){
        assertEquals(Problem4_Median_Of_Two_Sorted_Arrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 2.0);
        assertEquals(Problem4_Median_Of_Two_Sorted_Arrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 2.5);
        assertEquals(Problem4_Median_Of_Two_Sorted_Arrays.findMedianSortedArrays(new int[]{}, new int[]{1}), 1.0);
        assertEquals(Problem4_Median_Of_Two_Sorted_Arrays.findMedianSortedArrays(new int[]{}, new int[]{}), 0.0);
    }
}
