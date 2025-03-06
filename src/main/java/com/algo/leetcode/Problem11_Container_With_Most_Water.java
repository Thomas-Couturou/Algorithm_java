package com.algo.leetcode;

public class Problem11_Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxAmount = (right-left) * Math.min(height[left], height[right]);
        int amount;
        while (left < right){
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
            amount = (right-left) * Math.min(height[left], height[right]);
            if (amount > maxAmount){
                maxAmount = amount;
            }
        }
        return maxAmount;
    }
}
