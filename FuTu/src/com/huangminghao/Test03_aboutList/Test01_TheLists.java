package com.huangminghao.Test03_aboutList;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/11
 * @Time:8:39
 */

class Node {
    public int val;
    public Node next;
    public Node (int data) {
        val = data;
    }
}

class DoubleNode {
    public int val;
    public DoubleNode next;
    public DoubleNode last;
    public DoubleNode(int data) {
        val = data;
    }
}

public class Test01_TheLists {
    //单向链表的反转
    public static Node reverseLinkedList(Node head) {
        if (head == null) {
            return null;
        }
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    //双向链表的反转
    public static DoubleNode reverseDoubleList(DoubleNode head) {
        if (head == null) {
            return null;
        }
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }



    public static void main(String[] args) {

    }
}
