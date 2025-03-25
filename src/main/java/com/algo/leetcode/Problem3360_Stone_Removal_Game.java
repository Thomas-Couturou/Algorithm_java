package com.algo.leetcode;

public class Problem3360_Stone_Removal_Game {
    public static boolean canAliceWin(int n) {
        int stoneToRemove = 10;
        boolean aliceWin = false;
        while(n - stoneToRemove>=0){
            n = n - stoneToRemove;
            stoneToRemove --;
            aliceWin = !aliceWin;
        }
        return aliceWin;
    }
}
