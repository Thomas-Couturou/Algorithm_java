package com.algo.leetcode;

public class Problem2490_Circular_Sentence {
    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        for(int i = 0; i<words.length-1; i++){
            if (words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)){
                return false;
            }
        }
        return words[words.length-1].charAt(words[words.length-1].length()-1) == words[0].charAt(0);
    }
}
