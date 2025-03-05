package com.algo.leetcode;

import java.util.ArrayList;

public class Problem6_Zigzag_Conversion {
    public static String convert(String s, int numRows) {
        String result;
        if (numRows == 1){
            result = s;
        }
        else{
            ArrayList<ArrayList<Character>> tab = new ArrayList<>();
            int n = s.length();
            for(int j = 0; j<numRows; j++){
                tab.add(new ArrayList<>());
            }
            int i = 0;
            int row;
            int column = 0;
            while (i<n){
                if (column%(numRows -1) == 0){
                    row = 0;
                    while (i<n && row<numRows){
                        tab.get(row).add(s.charAt(i));
                        i++;
                        row++;
                    }
                }
                else{
                    tab.get(numRows -1 - column%(numRows -1)).add(s.charAt(i));
                    i++;
                }
                column++;
            }
            result = "";
            for (ArrayList<Character> line : tab){
                for(Character c : line){
                    result = result +c;
                }
            }
        }
        return result;
    }

    public static String convert2(String s, int numRows) {
        String result;
        if (numRows == 1){
            result = s;
        }
        else{
            result = "";
            int index ;
            int ecart;
            int n = s.length();
            for(int row = 0; row<numRows; row++){
                if (row == 0 || row == numRows - 1){
                    index = row;
                    while (index<n){
                        result = result + s.charAt(index);
                        index = index + 2*(numRows -1);
                    }
                }
                else{
                    index = row;
                    ecart = 2*(numRows - row - 1);
                    while (index<n){
                        result = result + s.charAt(index);
                        if (index + ecart < n){
                            result = result + s.charAt(index + ecart);
                        }
                        index = index + 2*(numRows -1);
                    }
                }
            }
        }
        return result;
    }
}
