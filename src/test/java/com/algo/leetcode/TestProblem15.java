package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem15 {
    @Test
    public void testProblem15(){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = Problem15_3Sum.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        line.add(-1);
        line.add(-1);
        line.add(2);
        expected.add(new ArrayList<>(line));
        line.clear();
        line.add(-1);
        line.add(0);
        line.add(1);
        expected.add(new ArrayList<>(line));
        assertEquals(expected, result);
    }

    @Test
    public void testProblem15_2(){
        int[] nums = {0, 1, 1};
        List<List<Integer>> result = Problem15_3Sum.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testProblem15_3(){
        int[] nums = {0, 0, 0};
        List<List<Integer>> result = Problem15_3Sum.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        line.add(0);
        line.add(0);
        line.add(0);
        expected.add(new ArrayList<>(line));
        assertEquals(expected, result);
    }
}
