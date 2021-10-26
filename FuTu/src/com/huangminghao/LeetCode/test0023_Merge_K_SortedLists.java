package com.huangminghao.LeetCode;

import java.util.*;

;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/26
 * @Time:20:47
 */
public class test0023_Merge_K_SortedLists {
    /**
     * TODO:合并数组链表成一个链表返回
     *  用小根堆
     */
    public static class ListNodeComparator implements Comparator<ListNode> {

        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    public static ListNode merge_K_SortedLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new ListNodeComparator());

        for (int i = 0; i < lists.length; i++) {//链表数组头节点加到小根堆里
            if (lists[i] != null) {
                heap.add(lists[i]);
            }
        }
        if (heap.isEmpty()) {
            return null;
        }
        ListNode head = heap.poll();//大链表
        ListNode pre = head;
        if (pre.next != null) {
            heap.add(pre.next);
        }
        while (!heap.isEmpty()) {
            ListNode cur = heap.poll();
            pre.next = cur;
            pre = cur;
            if (cur.next != null) {
                heap.add(cur.next);
            }
        }
        return head;
    }

    public static ListNode merge_K_SortedLists2(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                ans.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(ans);
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        for (int x : ans) {
            cur.next = new ListNode(x);
            cur = cur.next;
        }
        return res.next;
    }

}
