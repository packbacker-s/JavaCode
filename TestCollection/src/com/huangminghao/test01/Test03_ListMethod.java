package com.huangminghao.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/01
 * @Time:19:46
 */
public class Test03_ListMethod {
    /**
     * List接口中常用方法:
     * 增加: add(int index, E element) set(int index, E eLement)
     * 删除: remove(int index) remove(0bject o)
     * 修改:
     * 查看: get(int index)
     * 判断:
     *
     */
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(12);
        list.add(15);
        list.add(18);
        list.add(11);
        list.add(8);
        list.add(2);
        list.add("abc");

        System.out.println(list);

        list.add(2, 0);
        System.out.println(list);

        list.set(3,100);
        System.out.println(list);

        list.remove(2);//Integer数据类型，调用remove，删除的是下标对应值
        System.out.println(list);

        list.remove("abc");
        System.out.println(list);

        Object o = list.get(0);
        System.out.println(o);

        //list集合遍历
        //方法一：
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------");
        //方法二：
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("--------------");
        //方法三：
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
