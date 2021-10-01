/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 双向链表的插入：先绑后面 再绑前面
 *
 * @User:Mingaho
 * @Date:2021/04/14
 * @Time:19:03
 */
class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;

    public ListNode(int data) {
        this.data = data;
        ListNode next = null;
        ListNode prev = null;
    }


}
public class MyLinkList {
    public ListNode head;  //标志双向链表的头
    public ListNode tail;  //标志双向链表的尾

    //tou cha fa 头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //display  打印链表
    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //wei cha fa 尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    //contains链表是否包含关键字key
    public boolean contains(int key) {
        if(this.head == null) {
            return false;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return  false;
    }

    //size()链表长度
    public int size() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //checkIndex 判断index是否越界
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法"); //手动丢出异常
        }
    }
    //searchIndex
    private ListNode searchIndex(int index) {
        ListNode cur = this.head;
        while (index > 0) {
            while (cur != null) {
                cur = cur.next;
                index--;
            }
        }
        return cur;
    }
    //addIndex向链表中插入一个数字data
    public void addIndex(int data, int index) {
        checkIndex(index);
        if(index == 0) { //相当于头插法
            addFirst(data);
            return;
        }
        if(index == size()) {//相当于尾插法
            addLast(data);
            return;
        }
        ListNode cur = searchIndex(index);//cur为要插入位置的后驱 要插入的node节点在cur的前面
        ListNode node = new ListNode(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
        cur.prev.next = node;
    }

    //remove关键字key  找不到则返回-1
    public int removeKey(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur.data == key) {
                    this.head = this.head.next;
                    if(this.head != null) {
                        this.head.prev = null;
                    }
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;  //删除的是中间节点
                    }else {
                        this.tail = cur.prev;     //删除的是尾巴节点
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }

    //一个一个节点进行释放
    //clear
    public void clear() {
        while(this.head != null) {
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            head = cur;
        }
        this.tail = null;
    }

    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addFirst(1);
        myLinkList.addFirst(2);
        myLinkList.addFirst(3);
        myLinkList.addFirst(4);
        myLinkList.addFirst(5);
        myLinkList.display();
        System.out.println("=========");
        myLinkList.addLast(0);
        myLinkList.addLast(-1);
        myLinkList.addLast(-2);
        myLinkList.addLast(-3);
        myLinkList.addLast(-4);
        myLinkList.display();

        System.out.println("=========");
        boolean flat = myLinkList.contains(4);
        System.out.println(flat);

        System.out.println("=========");
        int length = myLinkList.size();
        System.out.println(length);

        System.out.println("=========");
        myLinkList.addIndex(99,0);
        myLinkList.addIndex(88,11);
        myLinkList.display();

        System.out.println("=========");
        myLinkList.removeKey(0);
        myLinkList.display();

        System.out.println("=========");
        myLinkList.clear();
        myLinkList.display();
        System.out.println("=========");
        System.out.println("1111111");
    }

}
