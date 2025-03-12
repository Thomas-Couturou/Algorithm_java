package com.algo.leetcode;

import org.junit.jupiter.api.Test;

public class TestProblem34 {
    @Test
    public void testProblem34(){
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = Problem34_Find_First_and_Last_Position.searchRange(nums, target);
        assert result[0] == 3;
        assert result[1] == 4;
    }

    @Test
    public void testProblem34_2(){
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] result = Problem34_Find_First_and_Last_Position.searchRange(nums, target);
        assert result[0] == -1;
        assert result[1] == -1;
    }

    @Test
    public void testProblem34_3(){
        int[] nums = {};
        int target = 0;
        int[] result = Problem34_Find_First_and_Last_Position.searchRange(nums, target);
        assert result[0] == -1;
        assert result[1] == -1;
    }
}
