package com.algo.interview;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNFirst {
    @Test
    public void testNFirstSort(){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = NFirst.nFirstSort(nums, 3);
        assertEquals(9, result[0]);
        assertEquals(8, result[1]);
        assertEquals(7, result[2]);
    }

    @Test
    public void testNFirst(){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> result = NFirst.nFirst(nums, 3);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(8);
        expected.add(9);
        assertEquals(expected, result);
    }

    @Test
    public void testNFirst_2(){
        int[] nums = {1, 6, 9, 4, -2, 6, 7, 8, -5};
        ArrayList<Integer> result = NFirst.nFirst(nums, 3);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(8);
        expected.add(9);
        assertEquals(expected, result);
    }

}
