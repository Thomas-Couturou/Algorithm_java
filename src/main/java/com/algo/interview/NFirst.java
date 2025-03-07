package com.algo.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NFirst {
    public static ArrayList<Integer> nFirst (int[] nums, int n){
        int m = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<m; i++){
            if (i<n){
                insert(result, nums[i]);
            }
            else{
                if (nums[i] > result.get(0)){
                    insert(result, nums[i]);
                    result.remove(0);
                }
            }
        }
        return result;
    }

    public static void insert(ArrayList<Integer> nums, int el){
        if (nums.size() == 0){
            nums.add(el);
        }
        int left  = 0;
        int right = nums.size()-1;
        int middle;
        while(left<right){
            middle = (left+right)/2;
            if (nums.get(middle) == el){
                right = middle -1;
                left = middle + 1;
            }
            else if (nums.get(middle) > el){
                right = middle -1;
            }
            else{
                left = middle + 1;
            }
        }
        if(nums.get(left) < el){
            nums.add(left +1, el);
        }
        else {
            nums.add(left, el);
        }
    }

    public static int[] nFirstSort(int[] nums, int n){
        int m = nums.length;
        Arrays.sort(nums);
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = nums[m-1-i];
        }
        return result;
    }

    public static void main(String[] args){
        Random random = new Random();
        int size = random.nextInt(10) +10;
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = random.nextInt(20)-10;
        }
        int n = Math.max(2,random.nextInt(size)/2) ;
        System.out.println(Arrays.toString(nums));
        System.out.println(n);
        System.out.println(nFirst(nums, n));
    }
}
