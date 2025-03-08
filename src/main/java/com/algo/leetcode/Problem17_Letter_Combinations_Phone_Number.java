package com.algo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem17_Letter_Combinations_Phone_Number {
    public static List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        String str = "";
        Map<Character, List<String>> corres = createCorres();
        return letterCombinationsRec(digits, corres, str, result);

    }

    private static List<String> letterCombinationsRec(String digits, Map<Character, List<String>> corres, String str, List<String> result){
        if(digits.equals("")){
            result.add(str);
            return result;
        }
        for (String el: corres.get(digits.charAt(0))){
            letterCombinationsRec(digits.substring(1), corres, str+el, result);
        }
        return result;
    }

    private static Map<Character, List<String>> createCorres(){
        Map<Character, List<String>> corres = new HashMap<>();
        List<String> values = new ArrayList<>();
        values.add("a");
        values.add("b");
        values.add("c");
        corres.put('2', new ArrayList<>(values));
        values.clear();
        values.add("d");
        values.add("e");
        values.add("f");
        corres.put('3', new ArrayList<>(values));
        values.clear();
        values.add("g");
        values.add("h");
        values.add("i");
        corres.put('4', new ArrayList<>(values));
        values.clear();
        values.add("j");
        values.add("k");
        values.add("l");
        corres.put('5', new ArrayList<>(values));
        values.clear();
        values.add("m");
        values.add("n");
        values.add("o");
        corres.put('6', new ArrayList<>(values));
        values.clear();
        values.add("p");
        values.add("q");
        values.add("r");
        values.add("s");
        corres.put('7', new ArrayList<>(values));
        values.clear();
        values.add("t");
        values.add("u");
        values.add("v");
        corres.put('8', new ArrayList<>(values));
        values.clear();
        values.add("w");
        values.add("x");
        values.add("y");
        values.add("z");
        corres.put('9', new ArrayList<>(values));
        return corres;
    }
}
