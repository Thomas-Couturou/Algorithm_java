package com.algo.leetcode;

public class Problem415_Add_Strings {
    public static String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int r = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = r;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 10);
            r = sum / 10;
        }
        if (r != 0) {
            result.append(r);
        }
        return result.reverse().toString();
    }
}
