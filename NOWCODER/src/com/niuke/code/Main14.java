package com.niuke.code;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *输入一个链表，输出该链表中倒数第k个结点。
 * 如果该链表长度小于k，请返回空。
 * 示例1
 * 输入
 * {1,2,3,4,5},1
 * 返回值
 * {5}
 * @User:Mingaho
 * @Date:2021/04/29
 * @Time:10:52
 */
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class Main14 {
    public Node FindKthToTail (Node head, int k) {
        if(head == null) {
            return null;
        }
        int cnt = 0;
        Node cur = head;
        while(cur != null) {
            cnt++;
            cur = cur.next;
        }
        if(k <= 0 || k > cnt) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (k - 1 > 0) {
            fast = fast.next;
            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
