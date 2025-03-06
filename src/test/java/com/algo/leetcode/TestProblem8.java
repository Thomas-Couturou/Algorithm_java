package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem8 {
    @Test
    public void testProblem8(){
        assertEquals(Problem8_String_To_Integer_Atoi.myAtoi("42"), 42);
        assertEquals(Problem8_String_To_Integer_Atoi.myAtoi("   -42"), -42);
        assertEquals(Problem8_String_To_Integer_Atoi.myAtoi("1337c0d3"), 1337);
        assertEquals(Problem8_String_To_Integer_Atoi.myAtoi("0-1"), 0);
        assertEquals(Problem8_String_To_Integer_Atoi.myAtoi("words and 987"), 0);
        assertEquals(Problem8_String_To_Integer_Atoi.myAtoi("9223372036854775808"), 2147483647);
    }
}
