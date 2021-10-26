/**
 * Created with IntelliJ IDEA.
 * Description:
 *单链表: 由节点组成
 *每一个节点都是一个类  有data next
 *
 *
 * @User:Mingaho
 * @Date:2021/04/09
 * @Time:21:14
 */
class Node {
    public int data;//0
    public Node next;//null

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class MyLinkedList {

    public Node head;  //保存单链表的头节点的引用  代表的是整个链表的头 所以定义在这个地方

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


    //查找在单链表中是否包含key关键字
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
        /*Node node = new Node(key);
        Node cur = this.head;
        while(cur != null) {
            if (cur.data == node.data) {
                return true;
            }
            cur = cur.next;
        }
        return false;*/
    }


    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }


    //找index的前驱
    private Node searchIndex(int index) {
        //1、对index进行合法性检查
        if(index < 0 || index > this.size()) {
            throw new RuntimeException("index's location is not right.");
        }
        Node cur = this.head; //index - 1步
        while (index > 1) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //在任意位置插入 第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == this.size()) {
            addLast(data);
            return;
        }
        //先找到index的前一个结点的地址
        Node cur = searchIndex(index);
        //进行插入
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
        /*Node node = new Node(data);
        Node cur = this.head;
        while((index > 1) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;*/
    }


    //找删除第一次出现关键字的前驱
    private Node searchPrev(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                break;   //return prev;
            }else {
                prev = prev.next;
            }
        }
        return prev;     //return null;
    }
    //删除第一次出现key的关键字的节点
    public void remove(int key) {
        if(this.head == null) {   //链表为空 直接return
            return;
        }
        if(this.head.data == key) {   //key如果是头节点 头节点直接指向下一个节点
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(key);
        if(prev.next == null) {
            System.out.println("is not exists the key.");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;

    }


    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if(this.head == null) {
            return;
        }
        Node prev = this.head;
        Node cur = this.head.next;  //代表要删除的节点
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }


    //清空
    public void clear() {
        this.head = null;
    }


    //反向链表
    public Node reverseList() {
        Node prev = null;
        Node cur = this.head;
        Node newHead = null;
        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    //打印单链表
    public void display2(Node newHead) {
        Node cur = newHead;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    //找到该链表的中间节点
    public Node findMinIndexKey() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return  slow;
    }


    //找到倒数第K个节点   单链表03
    public Node FindKNode(int K) {
        if(this.head == null) {
            return null;
        }
        if(K <= 0) {
            System.out.println("K is not right.");
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        //fast = fast.next.next;//？
        while (K - 1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                K--;
            }else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //删除倒数第k个节点
    public static Node removeNthNodeFrom_EndOfList2 (Node head, int k) {
        if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (k > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                return head.next;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }



    //给定一个x，  x的左边或右边 都大于等于/小于等于  x   单链表03
    public Node partition(int x) {
        Node begins = null;
        Node beginEnd = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while(cur != null) {    //没有遍历完
            if(cur.data < x) {

                if(begins != null) {      //第一段分为第一次插入还是第二次
                    beginEnd.next = cur;
                    beginEnd = beginEnd.next;
                }else {
                    begins = cur;
                    beginEnd = cur;
                }
            }else {
                if(as != null) {          //第二段分为第一次插入还是第二次
                    ae.next = cur;
                    ae = ae.next;
                }else {
                    as = cur;
                    ae = cur;
                }
            }
            cur = cur.next;
        }
        //1、如果bs为空 返回as
        if(begins == null) {
            return as;
        }
        //2、如果bs不为空  需要拼接
            beginEnd.next = as;
        //3、如果ae不为空  ae.next置为null
        if(ae != null) {
            ae.next = null;
        }
        return begins;
    }




    //删除重复的节点 1->2->2->3->3->4->5   1->4->5   单链表03
    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node temp = newHead;
        while(cur != null) {
            if(cur.next != null && cur.data != cur.next.data) {
                while(cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                temp.next = cur.next;
                temp = temp.next;
                cur = cur.next;
            }
        }
        temp.next = null;
        return newHead;
    }

    //链表的回文结构  单链表03              节点为奇数的时候12321
    public boolean chkPalindrome() {
        if(this.head == null) {  //单链表为空
            return  false;
        }
        if(this.head.next == null) {//只有一个节点
            return true;
        }
        //1、找到中间节点
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //2、反转单链表的后半部分，slow肯定是在中间节点
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }//完了之后slow是最后一个节点了

        //3、开始一个从头走一个从尾走
        while(slow != this.head) {
            if(slow.data != this.head.data) {
                return false;
            }

            if(this.head.next == slow) {  //判断偶数的情况
                return true;
            }
            
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }

    //判定链表是否有环  单链表04
    public boolean isHaveCircle() {
        Node fast = this.head;
        Node slow = this.head;
        if (fast == null) {
            return false;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;   //break;
            }
        }
        //if(fast == null || fast.next == null) {
              //return null;
        //}
        return false;
    }

    //链表中环的入口节点
    public Node detectCircle() {
        Node fast = this.head;
        Node slow = this.head;
        if(fast == null) {
            return null;
        }
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
                     //以上判断链表有环,但不能判断入口节点
        slow = this.head;   //有环的情况下 让slow=this.head
        while (fast != slow) {  //相遇时既是环的入口点
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }



}
