package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:16:38
 */

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
public class test0002_TwoNumAdd {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        int n1 = 0;
        int n2 = 0;
        int n = 0;
        int carry = 0;
        ListNode c1 = head1;
        ListNode c2 = head2;
        ListNode node = new ListNode(-1);
        ListNode cur = node;
        while (c1 != null || c2 != null) {
            n1 = c1 != null ? c1.val : 0;
            n2 = c2 != null ? c2.val : 0;//巧妙阿
            n = n1 + n2 + carry;

            cur.next = new ListNode(n % 10);
            cur = cur.next;
            carry = n / 10;

            c1 = c1 != null ? c1.next : null;
            c2 = c2 != null ? c2.next : null;//巧妙
        }
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return node.next;
    }
}
