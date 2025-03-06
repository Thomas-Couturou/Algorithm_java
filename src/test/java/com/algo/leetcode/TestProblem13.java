package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem13 {
    @Test
    public void testProblem13() {
        assertEquals(Problem13_Roman_To_Integer.romanToInt("III"), 3);
        assertEquals(Problem13_Roman_To_Integer.romanToInt("LVIII"), 58);
        assertEquals(Problem13_Roman_To_Integer.romanToInt("MCMXCIV"), 1994);
    }
}
