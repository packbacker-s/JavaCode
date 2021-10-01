package com.niuke.code;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 * @User:Mingaho
 * @Date:2021/04/30
 * @Time:12:56
 */

public class Main3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        ListNode cur = listNode;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        //listNode.next = null;
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
