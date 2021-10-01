package com.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/27
 * @Time:16:42
 */
public class 合并两个排序链表 {
    public ListNode Merge(ListNode listNode1, ListNode listNode2) {
       ListNode resList = new ListNode(-1);
       ListNode cur = resList;
       while (listNode1 != null && listNode2 != null) {
           if (listNode1.val < listNode2.val) {
               cur.next = listNode1;
               listNode1 = listNode1.next;
           } else {
               cur.next = listNode2;
               listNode2 = listNode2.next;
           }
           cur = cur.next;
       }
       if (listNode1 == null) {
           cur.next = listNode2;
       }
       if (listNode2 == null ) {
           cur.next = listNode1;
       }

       return resList.next;
    }
}
