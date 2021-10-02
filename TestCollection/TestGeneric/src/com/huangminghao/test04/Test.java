package com.huangminghao.test04;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/02
 * @Time:16:40
 */
public class Test {
    public static void main(String[] args) {
        /**
         * LinkedList常用方法
         *
         * 增加 addFirst(E e) addLast(E e)
         *     offer(E e)  offerFirst(E e)  offerLast(E e)
         * 修改
         * 删除poll()
         *   pollFirst()   pollLast()
         *   removeFirst() removeLast()
         * 查看 element（）
         *     getFirst()  getLast()
         *     indexOf(Object o) lastIndexOf(Object o)
         *     peek()
         *     peekFirst() peekLast()
         * getFirst()
         * 判断
         */


        LinkedList<String> list = new LinkedList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");
        list.add("eeee");
        list.add("ffff");
        list.add("gggg");
        list.add("bbbb");
        System.out.println(list);

        list.addFirst("1111");
        list.addLast("0000");
        System.out.println(list);

        list.offer("zzzzzz");
        list.offerFirst("tttt");
        list.offerLast("qqqq");
        System.out.println(list);//添加元素到尾部

        list.poll();//删除头上元素
        System.out.println(list);
        System.out.println("------------");
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        System.out.println(list);
        System.out.println("==========");



    }
}
