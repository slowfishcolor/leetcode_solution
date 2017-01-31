package no146LRUcache;

import java.util.HashMap;

/**
 * Created by Prophet on 2016/12/2.
 * Maintain a double linked list to track the call order.
 * Move the most recently called element to the front.
 * When reaches the Capacity, remove the last element.
 */
public class LRUCache1 {

    class Node {
        public Node pre = null;
        public Node next = null;
        public int key;
        public int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    private Node first = null;
    private Node last = null;
    private HashMap<Integer, Node> map;

    public LRUCache1(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToFirst(node);
            return node.value;
        }
        else {
            return -1;
        }
    }

    public void set(int key, int value) {

        Node node = new Node(key, value);

        if (map.size() >= capacity) {
            map.remove(last.key);
            removeLast();
        }

        node.next = first;
        first = node;
        map.put(key, node);

    }

    private void moveToFirst(Node node) {
        // node is null or already at the first place
        if (node == null || node == first) return;

        // node is the only one in the list
        if (first == null || last == null) {
            first = last = node;
            return;
        }

        // node is the last
        if (node == last) {
            last = last.pre;
            node.next = first.next;
            node.pre = null;
            first = node;
            return;
        }

        // connect pre and next
        if (node.pre != null) node.pre.next = node.next;
        if (node.next != null) node.next.pre = node.pre;

        // move to front
        node.next = first.next;
        node.pre = null;
        first = node;
    }

    private void removeLast() {
        if (last != null) {
            last = last.pre;
            if (last == null)
                first = null;
            else
                last.next =  null;
        }
    }
}
