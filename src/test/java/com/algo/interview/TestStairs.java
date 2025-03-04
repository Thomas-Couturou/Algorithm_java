package com.algo.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStairs {
    @Test
    public void testStairsRecursive(){
        assertEquals(0, Stairs.stairsProblemRecursive(-1));
        assertEquals(0, Stairs.stairsProblemRecursive(0));
        assertEquals(1, Stairs.stairsProblemRecursive(1));
        assertEquals(2, Stairs.stairsProblemRecursive(2));
        assertEquals(89, Stairs.stairsProblemRecursive(10));
        assertEquals(2132534333, Stairs.stairsProblem(10000));
    }

    @Test
    public void testStairs(){
        assertEquals(0, Stairs.stairsProblem(-1));
        assertEquals(0, Stairs.stairsProblem(0));
        assertEquals(1, Stairs.stairsProblem(1));
        assertEquals(2, Stairs.stairsProblem(2));
        assertEquals(89, Stairs.stairsProblem(10));
        assertEquals(2132534333, Stairs.stairsProblem(10000));
    }
}
