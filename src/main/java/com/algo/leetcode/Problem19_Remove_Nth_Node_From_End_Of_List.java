package com.algo.leetcode;

import com.algo.utils.ListNode;

public class Problem19_Remove_Nth_Node_From_End_Of_List {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0, head);
        removeNthFromEnd(head, n, prev);
        return prev.next;
    }

    private static int removeNthFromEnd(ListNode head, int n, ListNode prev){
        if (head == null){
            return 0;
        }
        int result = 1 + removeNthFromEnd(head.next, n, head);
        if (n == result){
            prev.next = head.next;
        }
        return result;
    }
}
