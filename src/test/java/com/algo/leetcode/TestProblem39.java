package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem39 {
    @Test
    public void testProblem39() {
        int[] candidates = new int[] {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = Problem39_Combination_Sum.combinationSum(candidates, target);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        line.add(2);
        line.add(2);
        line.add(3);
        expected.add(line);
        line = new ArrayList<>();
        line.add(7);
        expected.add(line);
        assertEquals(expected, result);
    }

    @Test
    public void testProblem39_2() {
        int[] candidates = new int[] {2, 3, 5};
        int target = 8;
        List<List<Integer>> result = Problem39_Combination_Sum.combinationSum(candidates, target);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        line.add(2);
        line.add(2);
        line.add(2);
        line.add(2);
        expected.add(line);
        line = new ArrayList<>();
        line.add(2);
        line.add(3);
        line.add(3);
        expected.add(line);
        line = new ArrayList<>();
        line.add(3);
        line.add(5);
        expected.add(line);
        assertEquals(expected, result);
    }

    @Test
    public void testProblem39_3() {
        int[] candidates = new int[] {2};
        int target = 1;
        List<List<Integer>> result = Problem39_Combination_Sum.combinationSum(candidates, target);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
}
