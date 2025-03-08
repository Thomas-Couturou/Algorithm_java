package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem17 {
    @Test
    public void testProblem17(){
        String digits = "23";
        List<String> result = Problem17_Letter_Combinations_Phone_Number.letterCombinations(digits);
        List<String> expected = new ArrayList<>();
        expected.add("ad");
        expected.add("ae");
        expected.add("af");
        expected.add("bd");
        expected.add("be");
        expected.add("bf");
        expected.add("cd");
        expected.add("ce");
        expected.add("cf");
        assertEquals(expected, result);

        digits = "";
        result = Problem17_Letter_Combinations_Phone_Number.letterCombinations(digits);
        expected = new ArrayList<>();
        assertEquals(expected, result);

        digits = "2";
        result = Problem17_Letter_Combinations_Phone_Number.letterCombinations(digits);
        expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        assertEquals(expected, result);

    }
}
