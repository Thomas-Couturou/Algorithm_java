package com.algo.leetcode;

public class Problem13_Roman_To_Integer {
    public static int romanToInt(String s) {
        int result = 0;
        int i = 0;
        int n = s.length();
        while (i<n){
            switch (s.charAt(i)){
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'C':
                    if (i+1<n){
                        switch (s.charAt(i + 1)){
                            case 'M':
                                i++;
                                result += 900;
                                break;
                            case 'D':
                                i++;
                                result += 400;
                                break;
                            default:
                                result += 100;
                        }
                    }
                    else{
                        result += 100;
                    }
                    break;
                case 'X':
                    if (i+1<n){
                        switch (s.charAt(i + 1)){
                            case 'C':
                                i++;
                                result += 90;
                                break;
                            case 'L':
                                i++;
                                result += 40;
                                break;
                            default:
                                result += 10;
                        }
                    }
                    else{
                        result += 10;
                    }
                    break;
                case 'I':
                    if (i+1<n){
                        switch (s.charAt(i +1)){
                            case 'X':
                                i++;
                                result += 9;
                                break;
                            case 'V':
                                i++;
                                result += 4;
                                break;
                            default:
                                result += 1;
                        }
                    }
                    else{
                        result += 1;
                    }
                    break;
            }
            i++;
        }
        return result;
    }
}
