package com.algo.leetcode;

public class Problem2594_Minimum_Time_to_Repair_Cars {
    public static long repairCars(int[] ranks, int cars) {
        long left = 0;
        long right = getMin(ranks) * cars*cars;
        while(left < right){
            long mid = (left + right)/2;
            if(canRepair(ranks, cars, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean canRepair(int[] ranks, int cars, long time){
        int count = 0;
        for (int rank : ranks) {
            count += Math.floor(Math.sqrt(time / rank));
            if (count >= cars) {
                return true;
            }
        }
        return false;
    }

    private static long getMin(int[] ranks){
        long min = Integer.MAX_VALUE;
        for (int rank : ranks) {
            if (rank < min) {
                min = rank;
            }
        }
        return min;
    }
}
