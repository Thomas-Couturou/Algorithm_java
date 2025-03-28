package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem415 {
    @Test
    public void testProblem415(){
        assertEquals(Problem415_Add_Strings.addStrings("11", "123"), "134");
        assertEquals(Problem415_Add_Strings.addStrings("456", "77"), "533");
        assertEquals(Problem415_Add_Strings.addStrings("0", "0"), "0");
    }
}
