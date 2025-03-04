package com.algo.leetcode;

public class Problem2_Add_Two_Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersRecursive(l1, l2, 0);
    }

    private static ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int r){
        ListNode result = new ListNode();
        if(l1 == null && l2 == null){
            if (r == 0){
                return null;
            }
            else{
                result.val = r;
                return result;
            }
        }
        else if (l1 == null){
            result.val = (l2.val + r)%10;
            result.next = addTwoNumbersRecursive(l1, l2.next, (l2.val + r)/10);
            return result;
        }
        else if (l2 == null){
            result.val = (l1.val + r)%10;
            result.next = addTwoNumbersRecursive(l1.next, l2, (l1.val + r)/10);
            return result;
        }
        else{
            result.val = (l1.val + l2.val + r)%10;
            result.next = addTwoNumbersRecursive(l1.next, l2.next, (l1.val + l2.val + r)/10);
            return result;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
