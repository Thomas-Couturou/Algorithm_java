package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem1455 {
    @Test
    public void testProblem1455(){
        assertEquals(Problem1455_Check_IF_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence.isPrefixOfWord("i love eating burger", "burg"), 4);
        assertEquals(Problem1455_Check_IF_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence.isPrefixOfWord("this problem is an easy problem", "pro"), 2);
        assertEquals(Problem1455_Check_IF_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence.isPrefixOfWord("i am tired", "you"), -1);
    }
}
