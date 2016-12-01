package no206reverseLinkedList;

/**
 * Created by Prophet on 2016/11/30.
 * recursively solution
 */
public class Solution {
    public ListNode reverseListNode(ListNode head) {
        if (head == null || head.next == null) return head;

        // get the second
        ListNode second = head.next;
        // set the tail
        head.next = null;

        // recursion
        ListNode rest = reverseListNode(second);
        second.next = head;

        return rest;
    }
}
