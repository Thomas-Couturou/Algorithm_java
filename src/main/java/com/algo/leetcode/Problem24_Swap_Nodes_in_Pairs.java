package com.algo.leetcode;
import com.algo.utils.ListNode;

public class Problem24_Swap_Nodes_in_Pairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode();
        ListNode current = result;
        ListNode nextNode;
        while (head != null && head.next != null){
            nextNode = head.next.next;
            current.next = head.next;
            current.next.next = head;
            current = current.next.next;
            head = nextNode;
        }
        current.next = head;
        return result.next;
    }
}
