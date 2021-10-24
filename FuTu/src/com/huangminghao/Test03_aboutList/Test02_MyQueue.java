package com.huangminghao.Test03_aboutList;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/11
 * @Time:9:04
 */
public class Test02_MyQueue {
    public static class Node<V> {
        public V val;
        public Node<V> next;

        public Node (V v) {
            val = v;
            next = null;
        }
    }

    //TODO:自己创建一个队列
    public static class MyQueue<V> {
        private Node<V> head;
        private Node<V> tail;
        private int size;

        public MyQueue() {
            head = null;
            tail = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }
        //元素进队列
        public void offer(V val) {
            Node<V> cur = new Node<>(val);
            if (tail == null) {
                head = cur;
                tail = cur;
            } else {
                tail.next = cur;
                tail = cur;
            }
            size++;
        }
        //元素出队列
        public V poll() {
            V ret = null;
            if (head != null) {
                ret = head.val;
                head = head.next;
                size--;
            }
            if (head == null) {//当所有数据弹完之后，tail与head位置保持一致，跟head一样指向null
                tail = null;
            }
            return ret;
        }

        public V peek() {
            V ret = null;
            if (head != null) {
                ret = head.val;
            }
            return ret;
        }

        //TODO:自己创建一个栈
        public static class MyStack<V> {
            private Node<V> head;
            private int size;

            public MyStack() {
                head = null;
                size = 0;
            }

            public boolean isEmpty() {
                return size == 0;
            }

            public int size() {
                return size;
            }

            public void push(V val) {
                Node<V> cur = new Node<>(val);
                if (head == null) {
                    head = cur;
                } else {
                    cur.next = head;//新头节点 指向老头节点
                    head = cur;//老头节点 移到新节点
                }
                size++;
            }

            public V pop() {
                V ret = null;
                if (head == null) {
                    return null;
                }
                return ret;
            }
        }
    }

}
