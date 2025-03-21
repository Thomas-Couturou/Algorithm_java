package com.algo.leetcode;

public class Problem2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    public static int minimumRecolors(String blocks, int k) {
        int nb_white = 0;
        int min_recolors;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                nb_white++;
            }
        }
        min_recolors = nb_white;
        for (int i = 0; i < blocks.length()-k; i++) {
            if (blocks.charAt(i) == 'W') {
                nb_white--;
            }
            if (blocks.charAt(i + k) == 'W') {
                nb_white++;
            }
            min_recolors = Math.min(min_recolors, nb_white);
        }
        return min_recolors;
    }
}
