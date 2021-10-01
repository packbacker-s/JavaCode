package huang.ming.hao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *合并两个有序链表
 * @User:Mingaho
 * @Date:2021/05/22
 * @Time:19:18
 */
class Node {
    public int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Test2 {
    public Node head;
    public Node Merge(Node listA, Node listB) {
        Node newNode = new Node(-1);
        Node cur = newNode;
        while (listA != null && listB != null) {
            if(listA.data <= listB.data) {
                cur.next = listA;
                listA = listA.next;
                cur = cur.next;
            } else {
                cur.next = listB;
                listB = listB.next;
                cur = cur.next;
            }
        }
        if(listA != null) {
            cur.next = listA;
        }
        if(listB != null) {
            cur.next = listB;
        }
        return newNode;
    }

}
