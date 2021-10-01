package com.niuke.code;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 牛客网合并两个有序链表
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则
 * 输入
 * {1,3,5},{2,4,6}
 * 返回值
 * {1,2,3,4,5,6}
 *
 * 1、首先定义一个虚拟头节点node，把两个有序的链表节点都插入到node头节点的后面，最后的返回值为node后面的节点node.next
 * 2、再定义一个cur的临时节点，cur指向node的头节点，用cur来记录list1和list2的插入情况，
 * 若用node来记录的话，到时候node节点指向的是list1和list2
 * 插入完的最尾部，到时候也只能返回一个最大的节点了
 * 3、判断循环的条件(list1和list2都非空)进入循环
 * 4、退出循环时，则表明list1或者list2其中一个已经插入完了
 * 现在只需要判断到底是list1还是list2插入完了
 * 只需要将cur.next指向还没插入完的链表就好了
 * 5、最后返回node.next就好了
 *
 * @User:Mingaho
 * @Date:2021/04/28
 * @Time:11:09
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode node = new ListNode(-1);   //定义一个虚拟节点  返回值为node.next
        ListNode cur = node; //cur节点指向node的节点
        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;     //一个节点插进来时，要让cur指向cur.next为下一个插入的节点留位置
        }
        if(list1 == null) {
            cur.next = list2;
        }
        if(list2 == null) {
            cur.next = list1;
        }
        return node.next;
    }
}
