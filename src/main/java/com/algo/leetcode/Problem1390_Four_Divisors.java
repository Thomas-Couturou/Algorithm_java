package com.algo.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem1390_Four_Divisors {
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            Set<Integer> divisors = new HashSet<>();
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    divisors.add(num / i);
                }
            }
            if (divisors.size() == 4) {
                for (int divisor : divisors) {
                    sum += divisor;
                }
            }
        }
        return sum;
    }
}
