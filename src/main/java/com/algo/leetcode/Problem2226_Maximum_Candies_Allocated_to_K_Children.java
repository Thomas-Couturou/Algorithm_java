package com.algo.leetcode;

public class Problem2226_Maximum_Candies_Allocated_to_K_Children {
    public static int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for (int candy : candies) {
            sum += candy;
        }
        long max_possible = sum/k;
        if (max_possible == 0){
            return 0;
        }
        long left = 1;
        long right = max_possible;
        while (left < right){
            long mid = (left + right)/2;
            if (isPossible(candies, k, mid)){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        if (isPossible(candies, k, left)){
            return (int) left;
        }
        return (int)left - 1;
    }

    private static boolean isPossible(int[] candies, long k, long mid){
        long count = 0;
        for (int candy : candies){
            count += candy/mid;
        }
        return count >= k;
    }
}
