package no024SwapNodesinPairs;

/**
 * Created by Prophet on 2017/2/8.
 */
public class TestSwapNodes {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode result = new SwapNodesinPairsSolution().swapPairs(node1);
    }
}
