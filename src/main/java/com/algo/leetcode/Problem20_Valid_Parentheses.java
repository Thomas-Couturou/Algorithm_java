package com.algo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem20_Valid_Parentheses {
    public static boolean isValid(String s) {
        List<String> stack = new ArrayList<>();
        for (int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                    stack.add(0, "(");
                    break;
                case '[':
                    stack.add(0, "[");
                    break;
                case '{':
                    stack.add(0, "{");
                    break;
                case ')':
                    if (stack.size() > 0 && stack.get(0).equals("(")){
                        stack.remove(0);
                    }
                    else{
                        return false;
                    }
                    break;
                case ']':
                    if (stack.size() > 0 && stack.get(0).equals("[")){
                        stack.remove(0);
                    }
                    else{
                        return false;
                    }
                    break;
                case '}':
                    if (stack.size() > 0 && stack.get(0).equals("{")){
                        stack.remove(0);
                    }
                    else{
                        return false;
                    }
                    break;
            }

        }
        return stack.isEmpty();
    }
}
