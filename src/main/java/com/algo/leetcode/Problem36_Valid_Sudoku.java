package com.algo.leetcode;

import java.util.*;

public class Problem36_Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> lines = new ArrayList<>();
        List<Set<Character>> columns = new ArrayList<>();
        List<Set<Character>> boxes = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            lines.add(new HashSet<>());
            columns.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num == '.') {
                    continue;
                }
                int box_index = (i / 3) * 3 + j / 3;
                if (lines.get(i).contains(num) || columns.get(j).contains(num) || boxes.get(box_index).contains(num)) {
                    return false;
                }
                lines.get(i).add(num);
                columns.get(j).add(num);
                boxes.get(box_index).add(num);
            }
        }
        return true;
    }
}
