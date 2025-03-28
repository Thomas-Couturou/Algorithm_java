package com.algo.leetcode;

public class Problem58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        String[] sentence = s.split(" ");
        return sentence[sentence.length -1].length();
    }
}
