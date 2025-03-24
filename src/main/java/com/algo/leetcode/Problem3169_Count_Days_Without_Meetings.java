package com.algo.leetcode;

import java.util.Arrays;

public class Problem3169_Count_Days_Without_Meetings {
    public static int countDays(int days, int[][] meetings){
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int count = 0;
        int end = 0;
        for(int[] meeting : meetings){
            if(meeting[0] > end){
                count += meeting[0] - end;
                end = meeting[1]+1;
            } else {
                end = Math.max(end, meeting[1]+1);
            }
        }
        count += days - end;
        return count;
    }
}
