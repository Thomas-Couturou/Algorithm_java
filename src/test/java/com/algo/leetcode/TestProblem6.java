package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem6 {
    @Test
    public void testProblem6(){
        assertEquals(Problem6_Zigzag_Conversion.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        assertEquals(Problem6_Zigzag_Conversion.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        assertEquals(Problem6_Zigzag_Conversion.convert("A", 1), "A");
    }

    @Test
    public void testProblem6_2(){
        assertEquals(Problem6_Zigzag_Conversion.convert2("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        assertEquals(Problem6_Zigzag_Conversion.convert2("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        assertEquals(Problem6_Zigzag_Conversion.convert2("A", 1), "A");
    }
}
