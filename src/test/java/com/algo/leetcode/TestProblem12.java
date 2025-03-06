package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem12 {
    @Test
    public void testProblem12(){
        assertEquals(Problem12_Integer_To_Roman.intToRoman(3749), "MMMDCCXLIX");
        assertEquals(Problem12_Integer_To_Roman.intToRoman(58), "LVIII");
        assertEquals(Problem12_Integer_To_Roman.intToRoman(1994), "MCMXCIV");
    }
}
