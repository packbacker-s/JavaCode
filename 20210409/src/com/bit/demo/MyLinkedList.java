package com.bit.demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/15
 * @Time:17:30
 */
class Node {
    public int data;//0
    public Node next;//null

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;
    //tou cha fa
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    // wei cha fa
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else {
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //size()
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //checkIndex
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index's location is not right.");
        }
    }
    //index
    public void addIndex(int index, int data) {
        Node node = new Node(data);
        Node cur = this.head;
        checkIndex(index);
        if(this.head == null) {
            addFirst(data);
        }
        if(index == size()) {
            addLast(data);
        }

    }
}
