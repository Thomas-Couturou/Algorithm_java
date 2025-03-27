package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2780 {
    @Test
    public void testProblem2780(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        assertEquals(Problem2780_Minimum_Index_of_a_Valid_Split.minimumIndex(nums), 2);
    }

    @Test
    public void testProblem2780_2(){
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(7);
        nums.add(1);
        nums.add(2);
        nums.add(1);
        assertEquals(Problem2780_Minimum_Index_of_a_Valid_Split.minimumIndex(nums), 4);
    }

    @Test
    public void testProblem2780_3(){
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(7);
        nums.add(2);
        nums.add(2);
        assertEquals(Problem2780_Minimum_Index_of_a_Valid_Split.minimumIndex(nums), -1);

    }
}
