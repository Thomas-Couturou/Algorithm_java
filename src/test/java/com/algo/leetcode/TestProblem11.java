package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem11 {
    @Test
    public void testProblem11(){
        assertEquals(Problem11_Container_With_Most_Water.maxArea(new int[]{1,8,6,2,5,4,8,3,7}), 49);
        assertEquals(Problem11_Container_With_Most_Water.maxArea(new int[]{1,1}), 1);
    }
}
