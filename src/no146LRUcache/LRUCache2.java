package no146LRUcache;

import java.util.HashMap;

/**
 * Created by Prophet on 2016/12/3.
 * Maintain a double linked list to track the call order.
 * Move the most recently called element to the front.
 * When reaches the Capacity, remove the last element.
 */
public class LRUCache2 {

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
    private Node head;
    private Node tail;
    private HashMap<Integer, Node> hashMap;


    public LRUCache2(int capacity) {

        this.capacity = capacity;

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;

        hashMap = new HashMap<>();
    }

    public int get(int key) {
        int value = 0;
        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            moveToFirst(node);
            value = node.value;
        }
        else {
            value = -1;
        }
        return value;
    }

    public void set(int key, int value) {

            if(hashMap.containsKey(key)) {
                Node node = hashMap.get(key);
                node.value = value;
                moveToFirst(node);
                hashMap.replace(key, node);
                return;
            }


        if (hashMap.size() >= capacity) {
            hashMap.remove(removeLast());
        }
        Node node = new Node(key, value);
        addToFirst(node);
        hashMap.put(key, node);
    }


    public void addToFirst(Node node) {
        head.next.pre = node;
        node.next = head.next;
        node.pre = head;
        head.next = node;
    }


    public void moveToFirst(Node node) {
        // connect pre and next
        node.pre.next = node.next;
        node.next.pre = node.pre;

        // move to first
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
        node.pre = head;
    }

    public int removeLast() {
        int key = tail.pre.key;
        tail.pre = tail.pre.pre;
        return key;
    }



}
