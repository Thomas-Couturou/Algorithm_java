package com.algo.leetcode;

import org.junit.jupiter.api.Test;
import com.algo.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestProblem19 {
    @Test
    public void testProblem19(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = Problem19_Remove_Nth_Node_From_End_Of_List.removeNthFromEnd(head, 2);
        assertEquals(result.val, 1);
        assertEquals(result.next.val, 2);
        assertEquals(result.next.next.val, 3);
        assertEquals(result.next.next.next.val, 5);
        assertNull(result.next.next.next.next);
    }

    @Test
    public void testProblem19_2(){
        ListNode head = new ListNode(1);

        ListNode result = Problem19_Remove_Nth_Node_From_End_Of_List.removeNthFromEnd(head, 1);
        assertNull(result);
    }

    @Test
    public void testProblem19_3(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode result = Problem19_Remove_Nth_Node_From_End_Of_List.removeNthFromEnd(head, 1);
        assertEquals(result.val, 1);
        assertNull(result.next);
    }
}
