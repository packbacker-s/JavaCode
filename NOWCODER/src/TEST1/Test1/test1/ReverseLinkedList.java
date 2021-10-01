package TEST1.Test1.test1;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/16
 * @Time:11:02
 */
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class ReverseLinkedList {
    public Node head;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            //第一次插入节点  第一个节点
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }


    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        /*Node cur = this.head;
        while (cur != null) {
            cur = cur.next;
        }
        cur.next = this.head;
        this.head = cur;*/
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void display2(Node newHead) {
        Node cur = newHead;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    public Node reverseList () {
        Stack<Node> stack = new Stack<>();
        Node cur = this.head;   //定义一个cur节点 指向头节点
        while (cur != null) {   //直至链表节点完全压入栈中
            stack.push(cur);
            cur = cur.next;
        }
        this.head.next = null; //原来的头节点置为null
        Node ret = stack.pop();   //ret为反向链表的头节点 先记录下来
        Node node = ret;          //node为剩余栈中的节点
        while (!stack.isEmpty()) { //直至栈为空 完全pop()出来为止
            node.next = stack.pop();
            node = node.next;
        }
        return ret;
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.addFirst(1);
        reverseLinkedList.addFirst(2);
        reverseLinkedList.addFirst(3);
        reverseLinkedList.addFirst(4);
        reverseLinkedList.display();

        Node ret = reverseLinkedList.reverseList();
        reverseLinkedList.display2(ret);

    }
}
