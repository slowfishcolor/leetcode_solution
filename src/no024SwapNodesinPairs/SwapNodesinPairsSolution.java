package no024SwapNodesinPairs;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 * Created by Prophet on 2017/2/8.
 */
public class SwapNodesinPairsSolution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        // preHead: 指向原指针头，防止丟链
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        // pre: 要交换的 pair 的前一个 node
        ListNode pre = preHead;
        // cur: 要交换的 pair 的第一个 node
        ListNode cur = preHead.next;
        // nextStart: 下一个需要交换的 pair 的第一个 node
        ListNode nextStart;
        // flag: 保证每移动两次交换一次
        boolean flag = true;
        while (cur.next!= null) {
            if (flag) {
                nextStart = cur.next.next;
                pre.next = cur.next;
                cur.next = nextStart;
                pre.next.next = cur;
                pre = pre.next;
            } else {
                pre = pre.next;
                cur = cur.next;
            }
            flag = !flag;
        }
        return preHead.next;
    }
}
