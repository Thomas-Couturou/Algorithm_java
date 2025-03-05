package com.algo.leetcode;

import java.util.ArrayList;

public class Problem7_Reverse_Integer {
    public static int reverse(int x) {
        ArrayList<Integer> nums = new ArrayList<>();
        boolean negative = false;
        int result;
        if (x<0){
            negative = true;
            x = -x;
        }
        while (x>0){
            nums.add(x%10);
            x = x/10;
        }
        result = 0;
        for(int i = 0; i<nums.size(); i++){
            result = 10* result + nums.get(i);
            if (result > Integer.MAX_VALUE/10 && i<nums.size() -1){
                result = 0;
                break;
            }
            else if (result == Integer.MAX_VALUE/10){
                if(i == nums.size() -2){
                    if ((!negative && nums.get(i+1) > Integer.MAX_VALUE%10) || (negative && nums.get(i+1) - 1 > Integer.MAX_VALUE%10)){
                        result = 0;
                        break;
                    }
                }
                else if(i < nums.size() -2){
                    result = 0;
                    break;
                }
            }
        }
        if (negative){
            result = -result;
        }
        return result;
    }
}
