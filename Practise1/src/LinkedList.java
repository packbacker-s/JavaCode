import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/10
 * @Time:16:50
 */

class NODE {
    public int data;
    public NODE next;
    public NODE(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    public NODE head;
    //tou cha fa
    public void addFirst(int data) {
        NODE node = new NODE(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //wei cha fa
    public void addLast(int data) {
        NODE node = new NODE(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        NODE cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //查找index的前驱位置
    public NODE searchIndex(int index) {
        if(index < 0 || index > this.size()) {
            throw new RuntimeException("index's location is not right.");
        }
        NODE prev = this.head;
        //NODE cur = this.head.next;
        while(index > 1) {
            prev = prev.next;
            index--;
        }
        return prev;
    }
    //任意位置插入data
    public void addIndex(int index, int data) {
        NODE node = new NODE(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        NODE prev = searchIndex(index);
        //NODE cur = prev.next;
        node.next = prev.next;
        prev.next = node;
    }

    //display
    public void display() {
        if(this.head == null) {
            System.out.println("The List is empty.");
            return;
        }
        NODE cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    //查找单链表中是否有该关键字
    public boolean contains(int key) {
        /*if(this.head == null) {
            return false;
        }*/
        NODE cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //length
    public int size() {
        int count = 0;
        NODE cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //remove
    public void removeKey(int key) {
        if(this.head == null) {
            System.out.println("is not exists the key.");
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        NODE cur = this.head;    // 为key关键字的前驱节点
        while (cur.next != null) {
            if(cur.next.data == key) {
                break;
            }
            cur = cur.next;
        }
        if(cur.next == null) {
            System.out.println("is not exists the key.");
            return;
        }
        cur.next = cur.next.next;
    }

    //delete all key
    public void removeAllKey(int key) {
        if(this.head == null) {
            return;
        }

    }

    //reverse
    public NODE reverse() {
        NODE prev = null;
        NODE cur = this.head.next;
        NODE newHead = null;
        while(cur != null) {
            NODE curNext = cur.next;
            if(curNext.next != null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }


    public void display2(NODE newHead) {
        NODE cur = newHead;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    //reverse tou cha fa
    public void reverseAddFirst() {
        NODE cur = this.head;
        NODE later = cur.next;
        cur.next = null;
        while(later != null) {
            later.next = cur;
            cur.next = later;
            later = later.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(12);
        linkedList.addLast(11);
        linkedList.addFirst(13);
        linkedList.addLast(10);
        linkedList.addFirst(14);
        linkedList.addLast(9);
        linkedList.display();
        linkedList.addFirst(15);
        linkedList.display();
        linkedList.addLast(8);
        linkedList.display();
        linkedList.addFirst(16);
        linkedList.display();

        boolean flat = linkedList.contains(16);
        System.out.println(flat);

        int len = linkedList.size();
        System.out.println(len);

        linkedList.addIndex(5,90);
        linkedList.display();

        /*Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            linkedList.addIndex(a,a);
            linkedList.display();
            linkedList.addFirst(a);
            linkedList.display();
        }*/

       /* linkedList.removeKey(16);
        linkedList.display();*/
        /*NODE ret = linkedList.reverseAddFirst();
        linkedList.display2(ret);*/

        linkedList.reverseAddFirst();
        linkedList.display();
    }
}
