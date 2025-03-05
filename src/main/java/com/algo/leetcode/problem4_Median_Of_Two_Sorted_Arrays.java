package com.algo.leetcode;

public class problem4_Median_Of_Two_Sorted_Arrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int objectif = (n + m)/2;
        int k = 0;
        int val1 = 0;
        int val2 = 0;
        double result;
        while (i < n && j < m && k < objectif + 1){
            if (nums1[i] <= nums2[j]){
                k++;
                if (k == objectif){
                    val1 = nums1[i];
                }
                else if (k == objectif + 1){
                    val2 = nums1[i];
                }
                i++;
            }
            else{
                k++;
                if (k == objectif){
                    val1 = nums2[j];
                }
                else if (k == objectif + 1){
                    val2 = nums2[j];
                }
                j++;
            }
        }
        while (i < n && k < objectif + 1){
            k++;
            if (k == objectif){
                val1 = nums1[i];
            }
            else if (k == objectif + 1){
                val2 = nums1[i];
            }
            i++;
        }
        while(j < m && k < objectif + 1){
            k++;
            if (k == objectif){
                val1 = nums2[j];
            }
            else if (k == objectif + 1){
                val2 = nums2[j];
            }
            j++;
        }
        if ((n+m)%2 == 0){
            result = ((double) val1 + (double) val2)/2;
        }
        else{
            result = val2;
        }
        return result;
    }
}
