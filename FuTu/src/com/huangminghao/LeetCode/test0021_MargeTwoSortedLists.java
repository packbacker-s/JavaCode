package com.huangminghao.LeetCode;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/26
 * @Time:19:39
 */
public class test0021_MargeTwoSortedLists {
    /**
     * TODO:合并两个有序链表
     * @param h1
     * @param h2
     * @return
     */
    public static ListNode margeTwoSortedLists (ListNode h1, ListNode h2) {
        if (h1 == null && h2 == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while (h1 != null && h2 != null) {
            if (h1.val <= h2.val) {
                cur.next = h1;
                h1 = h1.next;
            } else {
                cur.next = h2;
                h2 = h2.next;
            }
            cur = cur.next;
        }
        if (h1 == null) {
            cur.next = h2;
        }
        if (h2 == null) {
            cur.next = h1;
        }
        return newHead.next;
    }
}
