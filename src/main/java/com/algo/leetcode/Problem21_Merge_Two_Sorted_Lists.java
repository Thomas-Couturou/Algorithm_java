package com.algo.leetcode;

import com.algo.utils.ListNode;

public class Problem21_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode current = result;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null){
            current.next = list1;
        }
        if (list2 != null){
            current.next = list2;
        }
        return result.next;
    }
}
