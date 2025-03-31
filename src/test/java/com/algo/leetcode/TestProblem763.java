package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem763 {
    @Test
    public void testProblem763(){
        assertEquals(Problem763_Partition_Labels.partitionLabels("ababcbacadefegdehijhklij"), List.of(9,7,8));
        assertEquals(Problem763_Partition_Labels.partitionLabels("eccbbbbdec"), List.of(10));
    }
}
