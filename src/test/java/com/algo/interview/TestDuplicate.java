package com.algo.interview;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDuplicate {
    @Test
    public void testContainsDuplicate(){
        int[] numsEmpty = {};
        assert(!Duplicate.containsDuplicate(numsEmpty));

        int[] nums = {1, 2, 3};
        assert(!Duplicate.containsDuplicate(nums));

        int[] nums2 = {2,2,1,1};
        assert(Duplicate.containsDuplicate(nums2));
    }

    @Test
    public void testFindDuplicates(){
        int[] numsEmpty = {};
        assert(Duplicate.findDuplicates(numsEmpty).isEmpty());

        int[] nums = {1, 2, 3};
        assert(Duplicate.findDuplicates(nums).isEmpty());

        int[] nums2 = {2,2,1,1,3};
        Set<Integer> set = Duplicate.findDuplicates(nums2);
        List<Integer> expected = List.of(2,1);
        assertEquals(expected, new ArrayList<>(set));
    }

    @Test
    public void testRemoveDuplicates(){
        int[] numsEmpty = {};
        assert(Duplicate.removeDuplicates(numsEmpty).isEmpty());

        int[] nums = {1, 2, 3};
        Set<Integer> set = Duplicate.removeDuplicates(nums);
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, new ArrayList<>(set));

        int[] nums2 = {2,2,1,1};
        Set<Integer> set2 = Duplicate.removeDuplicates(nums2);
        List<Integer> expected2 = List.of(2,1);
        assertEquals(expected2, new ArrayList<>(set2));
    }
}
