package com.huangminghao.Test01_FuTu_BiShi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/10
 * @Time:16:18
 */
public class Test_02 {


     public class ListNode {
         int val;
         ListNode next = null;
      }

    /**
     *
     * @param head ListNode类 the head node
     * @param pivot int整型 the pivot
     * @return ListNode类
     */
    public ListNode changeListNode (ListNode head, int pivot) {

        /**
         * 左边小于pivot  右边大与pivot
         */
        // write code here
        if (head == null) {
            return null;
        }

        ListNode cur = head;
        ListNode beginTou = null;//
        ListNode beginWei = null;

        ListNode LaterTou = null;
        ListNode LaterWei = null;
        while (cur != null) {
            if (cur.val <= pivot) {//小于pivot的情况
                if (beginTou != null) {   //小于pivot的情况的不是第一次插入
                    beginWei.next = cur;
                    beginWei = beginWei.next;
                } else {                  //小于pivot的情况的第一次插入
                    beginTou = cur;
                    beginWei = cur;
                }
            } else {  //大于pivot的情况
                if (LaterTou != null) {   //大于pivot的情况的不是第一次插入
                    LaterWei.next = cur;
                    LaterWei = LaterWei.next;
                } else {                  //大于pivot的情况的第一次插入
                    LaterTou = cur;
                    LaterWei = cur;
                }
            }
            cur = cur.next;
        }

        if (beginTou == null) {  //若小于pivot的前一个链表头节点为null
            return LaterTou;      //说明这个链表都大于pivot，返回后一个链表的头节点
        }
        beginWei.next = LaterTou;  //不然的话就将两个链表衔接起来
        if (LaterWei != null) {
            LaterWei.next = null;   //将大于链表的最后一个节点的next置为null！！
        }
        return beginTou;
    }
}
