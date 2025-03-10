package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem18 {
    @Test
    public void testProblem18(){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> result = Problem18_4Sum.fourSum(nums, target);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        line.add(-2);
        line.add(-1);
        line.add(1);
        line.add(2);
        expected.add(new ArrayList<>(line));
        line.clear();
        line.add(-2);
        line.add(0);
        line.add(0);
        line.add(2);
        expected.add(new ArrayList<>(line));
        line.clear();
        line.add(-1);
        line.add(0);
        line.add(0);
        line.add(1);
        expected.add(new ArrayList<>(line));
        assertEquals(expected, result);
    }

    @Test
    public void testProblem18_2(){
        int[] nums = {2,2,2,2,2};
        int target = 8;
        List<List<Integer>> result = Problem18_4Sum.fourSum(nums, target);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        line.add(2);
        line.add(2);
        line.add(2);
        line.add(2);
        expected.add(new ArrayList<>(line));
        assertEquals(expected, result);
    }

    @Test
    public void testProblem18_3(){
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> result = Problem18_4Sum.fourSum(nums, target);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
}
