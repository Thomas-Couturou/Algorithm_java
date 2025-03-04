package com.algo.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem2 {
    @Test
    public void testProblem2(){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = Problem2_Add_Two_Numbers.addTwoNumbers(l1, l2);
        assertEquals(result.val, 7);
        assertEquals(result.next.val, 0);
        assertEquals(result.next.next.val, 8);
    }

    @Test
    public void testProblem2_2(){
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode result = Problem2_Add_Two_Numbers.addTwoNumbers(l1, l2);
        assertEquals(result.val, 0);
    }

    @Test
    public void testProblem2_3(){
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode result = Problem2_Add_Two_Numbers.addTwoNumbers(l1, l2);
        assertEquals(result.val, 8);
        assertEquals(result.next.val, 9);
        assertEquals(result.next.next.val, 9);
        assertEquals(result.next.next.next.val, 9);
        assertEquals(result.next.next.next.next.val, 0);
        assertEquals(result.next.next.next.next.next.val, 0);
        assertEquals(result.next.next.next.next.next.next.val, 0);
        assertEquals(result.next.next.next.next.next.next.next.val, 1);
    }
}
