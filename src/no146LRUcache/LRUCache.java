package no146LRUcache;

import java.util.HashMap;

/**
 * Created by Prophet on 2016/12/3.
 * Maintain a double linked list to track the call order.
 * Move the most recently called element to the front.
 * When reaches the Capacity, remove the last element.
 */
public class LRUCache {
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

    public LRUCache(int capacity) {
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
        int value = -1;
        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            value = node.value;
            // move to front
            deleteNode(node);
            addToHead(node);
        }
        else {
            value = -1;
        }
        return value;
    }

    public void set(int key, int value) {

        if(hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            deleteNode(node);
            addToHead(node);
            hashMap.replace(key, node);
            return;
        }

        if (hashMap.size() >= capacity) {
            Node node = new Node(key, value);
            hashMap.remove(tail.pre.key);
            deleteNode(tail.pre);
            addToHead(node);
            hashMap.put(key, node);
        }
        else {
            Node node = new Node(key, value);
            addToHead(node);
            hashMap.put(key, node);
        }
    }

    public void deleteNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void addToHead(Node node) {
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }
}
