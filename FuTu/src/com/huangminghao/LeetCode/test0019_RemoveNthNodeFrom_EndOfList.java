package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/26
 * @Time:17:50
 */

public class test0019_RemoveNthNodeFrom_EndOfList {

    public static ListNode removeNthNodeFrom_EndOfList2 (ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                return head.next;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static ListNode removeNthNodeFrom_EndOfList (ListNode head, int n) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur.next != null) {
            n--;
            if (n == -1) {//遍历完了 赋头节点
                pre = head;
            }
            if (n < -1) {
                pre = pre.next;
            }
            cur = cur.next;
        }
        if (n > 0) {//n大于链表长度
            return head;
        }
        if (pre == null) {//说明删除的是头节点
            return head.next;
        }
        pre.next = pre.next.next;
        return head;
    }




}
