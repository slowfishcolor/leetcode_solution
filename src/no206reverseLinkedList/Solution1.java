package no206reverseLinkedList;

/**
 * Created by Prophet on 2016/11/30.
 * Iterative solution
 */
public class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p = head;
        ListNode n = head.next;
        ListNode t = null;
        // iteration
        while (n.next != null) {
            t = n.next;
            n.next = p;
            p = n;
            n = t;
        }
        // head
        n.next = p;
        // tail
        head.next = null;
        return n;
    }
}
