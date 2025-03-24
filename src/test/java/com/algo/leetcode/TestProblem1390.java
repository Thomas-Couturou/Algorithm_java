package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1390 {
    @Test
    public void testProblem1390(){
        assertEquals(Problem1390_Four_Divisors.sumFourDivisors(new int[]{21,4,7}), 32);
        assertEquals(Problem1390_Four_Divisors.sumFourDivisors(new int[]{21,21}), 64);
        assertEquals(Problem1390_Four_Divisors.sumFourDivisors(new int[]{1,2,3,4,5}), 0);
    }
}
