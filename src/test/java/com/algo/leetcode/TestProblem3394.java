package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProblem3394 {
    @Test
    public void testProblem3394(){
        int[][] rectangles = new int[][]{{1,0,5,2},{0,2,2,4},{3,2,5,3},{0,4,4,5}};
        assertTrue(Problem3394_Check_if_Grid_can_be_Cut_into_Sections.checkValidCuts(5, rectangles));

        rectangles = new int[][]{{0,0,1,1},{2,0,3,4},{0,2,2,3},{3,0,4,3}};
        assertTrue(Problem3394_Check_if_Grid_can_be_Cut_into_Sections.checkValidCuts(4, rectangles));

        rectangles = new int[][]{{0,2,2,4},{1,0,3,2},{2,2,3,4},{3,0,4,2}, {3,2,4,4}};
        assertFalse(Problem3394_Check_if_Grid_can_be_Cut_into_Sections.checkValidCuts(4, rectangles));
    }
}
