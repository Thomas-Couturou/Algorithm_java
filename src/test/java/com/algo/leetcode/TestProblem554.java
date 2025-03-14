package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem554 {
    @Test
    public void testProblem554() {
        List<List<Integer>> wall = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(2);
        row.add(2);
        row.add(1);
        wall.add(row);
        row = new ArrayList<>();
        row.add(3);
        row.add(1);
        row.add(2);
        wall.add(row);
        row = new ArrayList<>();
        row.add(1);
        row.add(3);
        row.add(2);
        wall.add(row);
        row = new ArrayList<>();
        row.add(2);
        row.add(4);
        wall.add(row);
        row = new ArrayList<>();
        row.add(3);
        row.add(1);
        row.add(2);
        wall.add(row);
        row = new ArrayList<>();
        row.add(1);
        row.add(3);
        row.add(1);
        row.add(1);
        wall.add(row);
        assertEquals(Problem554_Brick_Wall.leastBricks(wall), 2);
    }

    @Test
    public void testProblem554_2() {
        List<List<Integer>> wall = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        wall.add(new ArrayList<>(row));
        wall.add(new ArrayList<>(row));
        wall.add(new ArrayList<>(row));
        assertEquals(Problem554_Brick_Wall.leastBricks(wall), 3);
    }
}
