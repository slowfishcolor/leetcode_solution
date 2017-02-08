package no002AddTwoNumbers;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 * Created by Prophet on 2017/2/8.
 */
public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        int carry = 0;
        while (l1 != null && l2 != null) {
            ListNode dNode = new ListNode(0);
            int digit = l1.val + l2.val + carry;
            if (digit < 10) {
                dNode.val = digit;
                carry = 0;
            } else {
                dNode.val = digit % 10;
                carry = 1;
            }
            p.next = dNode;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            int digit = l1.val + carry;
            if (digit < 10) {
                l1.val = digit;
                carry = 0;
            } else {
                l1.val = digit % 10;
                carry = 1;
            }
            p.next = l1;
            p = p.next;
        }

        if (l2 != null) {
            int digit = l2.val + carry;
            if (digit < 10) {
                l2.val = digit;
                carry = 0;
            } else {
                l2.val = digit % 10;
                carry = 1;
            }
            p.next = l2;
            p = p.next;
        }

        while (carry != 0) {
            if (p.next == null) {
                p.next = new ListNode(1);
                carry = 0;
            } else {
                int digit = p.next.val + carry;
                if (digit < 10) {
                    p.next.val = digit;
                    carry = 0;
                } else {
                    p.next.val = digit % 10;
                    carry = 1;
                }
            }
            p = p.next;
        }

        return head.next;
    }
}
