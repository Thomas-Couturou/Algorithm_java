package com.algo.interview;

public class Stairs {
    public static int stairsProblemRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return stairsProblemRecursive(n - 1) + stairsProblemRecursive(n - 2);
    }
    public static int stairsProblem(int n) {
        int result;
        if (n <= 0) {
            result = 0;
        }
        else if (n == 1) {
            result = 1;
        }
        else{
            int[] tab = new int[n + 1];
            tab[1] = 1;
            tab[2] = 2;
            for (int i = 3; i <= n; i++) {
                tab[i] = tab[i-1] + tab[i-2];
            }
            result = tab[n];
        }
        return result;
    }
}
