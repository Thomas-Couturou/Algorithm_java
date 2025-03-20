package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2269 {
    @Test
    public void testProblem2269(){
        assertEquals(Problem2269_Find_the_K_beauty_of_a_Number.divisorSubstrings(240, 2), 2);
        assertEquals(Problem2269_Find_the_K_beauty_of_a_Number.divisorSubstrings(430043, 2), 2);
    }
}
