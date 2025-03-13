package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem49 {
    @Test
    public void testProblem49() {
        String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = Problem49_Group_Anagrams.groupAnagrams(strs);
        List<List<String>> expected = new ArrayList<>();
        List<String> line = new ArrayList<>();
        line.add("eat");
        line.add("tea");
        line.add("ate");
        expected.add(line);
        line = new ArrayList<>();
        line.add("tan");
        line.add("nat");
        expected.add(line);
        line = new ArrayList<>();
        line.add("bat");
        expected.add(line);
        assertEquals(expected, result);
    }

    @Test
    public void testProblem49_2() {
        String[] strs = new String[] {""};
        List<List<String>> result = Problem49_Group_Anagrams.groupAnagrams(strs);
        List<List<String>> expected = new ArrayList<>();
        List<String> line = new ArrayList<>();
        line.add("");
        expected.add(line);
        assertEquals(expected, result);
    }

    @Test
    public void testProblem49_3() {
        String[] strs = new String[] {"a"};
        List<List<String>> result = Problem49_Group_Anagrams.groupAnagrams(strs);
        List<List<String>> expected = new ArrayList<>();
        List<String> line = new ArrayList<>();
        line.add("a");
        expected.add(line);
        assertEquals(expected, result);
    }
}
