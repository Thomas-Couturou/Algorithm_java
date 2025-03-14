package com.algo.leetcode;

public class Problem1346_Check_If_N_And_Its_Double_Exist {
    public static boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                if(i!= j && arr[i] == 2* arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
