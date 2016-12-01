package no206reverseLinkedList;

/**
 * Created by Prophet on 2016/11/30.
 */
public class Test {
    public static void main(String args[]) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = null;
        //Solution1 s1 = new Solution1();
        //ListNode head = s1.reverseList(a);
        Solution s = new Solution();
        ListNode head = s.reverseListNode(a);
    }
}
