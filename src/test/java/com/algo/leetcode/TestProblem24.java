package com.algo.leetcode;

import com.algo.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem24 {
    @Test
    public void testProblem24() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode result = Problem24_Swap_Nodes_in_Pairs.swapPairs(head);
        assertEquals(result.val, 2);
        assertEquals(result.next.val, 1);
        assertEquals(result.next.next.val, 4);
        assertEquals(result.next.next.next.val, 3);
    }

    @Test
    public void testProblem24_2() {
        ListNode head = new ListNode(1);
        ListNode result = Problem24_Swap_Nodes_in_Pairs.swapPairs(head);
        assertEquals(result.val, 1);
    }

    @Test
    public void testProblem24_3() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = Problem24_Swap_Nodes_in_Pairs.swapPairs(head);
        assertEquals(result.val, 2);
        assertEquals(result.next.val, 1);
        assertEquals(result.next.next.val, 3);
    }
}
