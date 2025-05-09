package com.algo.leetcode;

public class Problem12_Integer_To_Roman {
    public static String intToRoman(int num) {
        String result = "";
        while (num>0){
            if (num >= 1000){
                result = result + "M";
                num -= 1000;
            }
            else if (num >= 900){
                result = result + "CM";
                num -= 900;
            }
            else if (num >= 500){
                result = result + "D";
                num -= 500;
            }
            else if (num >= 400){
                result = result + "CD";
                num -= 400;
            }
            else if (num >= 100){
                result = result + "C";
                num -= 100;
            }
            else if (num >= 90){
                result = result + "XC";
                num -= 90;
            }
            else if (num >= 50){
                result = result + "L";
                num -= 50;
            }
            else if (num >= 40){
                result = result + "XL";
                num -= 40;
            }
            else if (num >= 10){
                result = result + "X";
                num -= 10;
            }
            else if (num >= 9){
                result = result + "IX";
                num -= 9;
            }
            else if (num >= 5){
                result = result + "V";
                num -= 5;
            }
            else if (num >= 4){
                result = result + "IV";
                num -= 4;
            }
            else {
                result = result + "I";
                num -= 1;
            }
        }
        return result;
    }
}
