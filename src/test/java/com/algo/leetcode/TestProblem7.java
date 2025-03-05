package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem7 {
    @Test
    public void testProblem7(){
        assertEquals(Problem7_Reverse_Integer.reverse(123), 321);
        assertEquals(Problem7_Reverse_Integer.reverse(-123), -321);
        assertEquals(Problem7_Reverse_Integer.reverse(120), 21);
        assertEquals(Problem7_Reverse_Integer.reverse(0), 0);
        assertEquals(Problem7_Reverse_Integer.reverse(1534236469), 0);
        assertEquals(Problem7_Reverse_Integer.reverse(-1463847412), -2147483641);
    }
}
