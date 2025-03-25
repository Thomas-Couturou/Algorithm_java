package com.algo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3394_Check_if_Grid_can_be_Cut_into_Sections {
    public static boolean checkValidCuts(int n, int[][] rectangles) {
        Arrays.sort(rectangles, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> overlaps = new ArrayList<>();
        int[] currentRectangle = rectangles[0];
        for (int[] rectangle : rectangles) {
            if (rectangle[0] < currentRectangle[2]) {
                currentRectangle[2] = Math.max(currentRectangle[2], rectangle[2]);
            } else {
                overlaps.add(currentRectangle);
                currentRectangle = rectangle;
            }
        }
        if (overlaps.size() >= 2) {
            return true;
        }

        Arrays.sort(rectangles, (a, b) -> Integer.compare(a[1], b[1]));
        overlaps = new ArrayList<>();
        currentRectangle = rectangles[0];
        for (int[] rectangle : rectangles) {
            if (rectangle[1] < currentRectangle[3]) {
                currentRectangle[3] = Math.max(currentRectangle[3], rectangle[3]);
            } else {
                overlaps.add(currentRectangle);
                currentRectangle = rectangle;
            }
        }
        return overlaps.size() >= 2;
    }
}
