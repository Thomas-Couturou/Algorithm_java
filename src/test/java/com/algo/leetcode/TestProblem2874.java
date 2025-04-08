package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2874 {
    @Test
    public void testProblem2874() {
        assertEquals(Problem2874_Maximum_Value_of_an_Ordered_Triplet_II.maximumTripletValue(new int[]{12, 6, 1, 2, 7}), 77);
        assertEquals(Problem2874_Maximum_Value_of_an_Ordered_Triplet_II.maximumTripletValue(new int[]{1, 10, 3, 4, 19}), 133);
        assertEquals(Problem2874_Maximum_Value_of_an_Ordered_Triplet_II.maximumTripletValue(new int[]{1, 2, 3}), 0);
    }
}
