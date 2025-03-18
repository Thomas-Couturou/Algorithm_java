package com.algo.leetcode;

public class Problem1455_Check_IF_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int index = 1;
        for (String word : words){
            if(word.startsWith(searchWord)){
                return index;
            }
            index ++;
        }
        return -1;
    }
}
