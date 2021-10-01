package com.minghao;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 *
 * 如输入{1,2,3}的链表如下图:
 *
 * 返回一个数组为[3,2,1]
 *
 * 0 <= 链表长度 <= 10000
 *
 * @User:Mingaho
 * @Date:2021/08/26
 * @Time:14:53
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}
public class 从尾到头打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode cur = listNode;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

}
