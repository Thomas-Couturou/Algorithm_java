package com.algo.leetcode;

import org.junit.jupiter.api.Test;
import com.algo.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblem21 {
    @Test
    public void testProblem21(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = Problem21_Merge_Two_Sorted_Lists.mergeTwoLists(l1, l2);
        assertEquals(result.val, 1);
        assertEquals(result.next.val, 1);
        assertEquals(result.next.next.val, 2);
        assertEquals(result.next.next.next.val, 3);
        assertEquals(result.next.next.next.next.val, 4);
        assertEquals(result.next.next.next.next.next.val, 4);
    }

    @Test
    public void testProblem21_2(){
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode(0);
        ListNode result = Problem21_Merge_Two_Sorted_Lists.mergeTwoLists(l1, l2);
        assertEquals(result.val, 0);
    }
}
