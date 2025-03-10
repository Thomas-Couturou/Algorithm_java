package com.algo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem22_Generate_Parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", result);
        return result;
    }
    private static void generateParenthesis(int n, int open, int close, String s, List<String> result){
        if (open == n && close == n){
            result.add(s);
        }
        if (open < n){
            generateParenthesis(n, open+1, close, s+"(", result);
        }
        if (close < open){
            generateParenthesis(n, open, close+1, s+")", result);
        }
    }
}
