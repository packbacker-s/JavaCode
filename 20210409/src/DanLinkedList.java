/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/10
 * @Time:9:21
 */

public class DanLinkedList {

    //创建两个相交的链表
    public static void createCut(Node headA, Node headB) {
        headA.next =headB.next.next;
    }

    //两个链表相遇的节点
    public static Node getIntersectionNode(Node headA, Node headB) {
        //1、求长度 走差值步
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        while(pl != null) {
            lenA++;
            pl = pl.next;            //求链表A的长度
        }
        while(ps != null) {
            lenB++;
            ps = ps.next;            //求链表B的长度
        }
        pl = headA;                   //重新指向各自头节点，为走差值做准备
        ps = headB;
        int len = lenA - lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //pl为最长的链表
        for(int i = 0; i < len; i++) {
            pl = pl.next;
        }
        //2、pl ps 在同一起跑线上
        while(ps != pl && pl != null && ps != null) {
            pl = pl.next;
            ps = ps.next;
        }
        if(pl == ps && pl != null) {
            return pl;
        }
        return null;
    }


    //合并有序两个有序的链表
    public static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node temp = newHead;
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                temp.next = headA;
                temp = temp.next;
                headA = headA.next;
            }else {
                temp.next = headB;
                temp = temp.next;
                headB = headB.next;
            }
        }
        if(headA == null) {
            temp.next = headB;
        }
        if(headB == null) {
            temp.next = headA;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        /*MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);           //头插入法
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.addLast(14);             //尾插入法
        myLinkedList.addLast(14);
        myLinkedList.addLast(14);
        myLinkedList.addLast(15);
        myLinkedList.addLast(16);
        myLinkedList.addLast(14);
        myLinkedList.addLast(14);
        myLinkedList.addLast(14);
        myLinkedList.display();

        boolean flat = myLinkedList.contains(13);//判断单链表是否存在关键key
        System.out.println(flat);

        System.out.println(myLinkedList.size());//求单链表长度

        myLinkedList.addIndex(6,40);
        myLinkedList.display();

    *//*    myLinkedList.remove(10);        //删除关键字key
        myLinkedList.remove(40);
        myLinkedList.remove(15);
        myLinkedList.remove(16);
        myLinkedList.remove(77);
        myLinkedList.display();*//*

        myLinkedList.removeAllKey(14);
        myLinkedList.display();

*//*        System.out.println("====");
        myLinkedList.clear();
        myLinkedList.display();
        System.out.println("====");*//*

        Node ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.addLast(89);
        myLinkedList.addLast(98);
        myLinkedList.display();

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(24);
        myLinkedList2.addLast(48);
        myLinkedList2.addLast(60);
        myLinkedList2.addLast(78);
        myLinkedList2.addLast(67);
        myLinkedList2.display();


        /*createCut(myLinkedList.head, myLinkedList2.head);
        Node ret = getIntersectionNode(myLinkedList.head, myLinkedList2.head);
        System.out.println(ret.data);*/


        Node ret2 = mergeTwoLists(myLinkedList.head, myLinkedList2.head);
        myLinkedList2.display2(ret2);
    }
}
