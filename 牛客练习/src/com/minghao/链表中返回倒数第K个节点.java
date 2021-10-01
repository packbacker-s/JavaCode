package com.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 *
 * class ListNode {
 *     int val;
 *     ListNode next = null;
 *
 *     ListNode(int val) {
 *         this.val = val;
 *     }
 *
 * }
 * @User:Mingaho
 * @Date:2021/08/27
 * @Time:14:59
 */
public class 链表中返回倒数第K个节点 {
    public ListNode FindKthToTail(int K, ListNode listNode) {
        if (listNode == null) {
            return null;
        }
        ListNode cur = listNode;
        int cnt = 0;
        while (cur != null) {
            cnt++;
            cur = cur.next;
        }
        if (K <= 0 || K > cnt) {
            return null;
        }
        ListNode fast = listNode;
        ListNode slow = listNode;
        while (K - 1 > 0) {
            fast = fast.next;
            K--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
