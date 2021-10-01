package com.minghao;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/27
 * @Time:15:17
 */
public class 反转链表 {
    public ListNode ReserveList (ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        if (listNode == null) {
            return null;
        }
        ListNode cur = listNode;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        listNode.next = null;
        ListNode resList = stack.pop();
        ListNode cur1 = resList;
        while (!stack.isEmpty()) {
            cur1.next = stack.pop();
            cur1 = cur1.next;
        }
        return resList;
    }
}
