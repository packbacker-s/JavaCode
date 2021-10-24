package com.huangminghao.Test04_Tuya_Bishi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/15
 * @Time:21:15
 */


 class ListNode {
   int val;
   ListNode next = null;
    public ListNode(int val) {
    this.val = val;
    }
 }

public class test02_ArrayListNode_OrderByOneList {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 合并K个升序链表
     * @param lists ListNode类一维数组 lists
     * @return ListNode类
     */
    public ListNode mergeKLists (ListNode[] lists) {
        int len = lists.length;
        ListNode[] arr = new ListNode[len];
        for (int i = 0; i < len; i++) {
            arr[i] = lists[i];
        }

        return null;
        // write code here
    }
}
