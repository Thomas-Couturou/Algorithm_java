package com.algo.leetcode;

import java.util.*;

public class Problem49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (String str : strs) {
            boolean found = false;
            for (List<String> list : result) {
                if (isAnagram(list.get(0), str)) {
                    list.add(str);
                    found = true;
                    break;
                }
            }
            if (!found) {
                List<String> list = new ArrayList<>();
                list.add(str);
                result.add(list);
            }
        }
        return result;
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        for(int i=0; i<arrayS.length; i++){
            if(arrayS[i] != arrayT[i]){
                return false;
            }
        }
        return true;
    }
}
