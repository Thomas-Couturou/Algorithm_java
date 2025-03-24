package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem3169 {
    @Test
    public void testProblem3169(){
        assertEquals(Problem3169_Count_Days_Without_Meetings.countDays(10, new int[][]{{5,7},{1,3},{9,10}}), 2);
        assertEquals(Problem3169_Count_Days_Without_Meetings.countDays(5, new int[][]{{2,4},{1,3}}), 1);
        assertEquals(Problem3169_Count_Days_Without_Meetings.countDays(6, new int[][]{{1,6}}), 0);
    }
}
