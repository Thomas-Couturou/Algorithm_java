package com.algo.leetcode;

public class Problem28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        int i = 0;
        int j;
        while (i < haystack.length()){
            if (haystack.charAt(i) == needle.charAt(0)){
                j = 0;
                while (j < needle.length() && i+j < haystack.length() && haystack.charAt(i+j) == needle.charAt(j)){
                    j++;
                }
                if (j == needle.length()){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}
