package com.huangminghao.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/01
 * @Time:18:40
 */
public class Test02_Traverse {
    public static void main(String[] args) {
        Collection col = new ArrayList<>();
        //调用方法
        //集合有一个特点，只能存方引用类型，不能是基本数据类型
        //基本数据类型自动装箱，对应包装类 int -> Integer
        col.add(18);
        col.add(12);
        col.add(15);
        col.add(11);
        col.add("abc");
        col.add(7.77);

        //对集合的遍历
        //方式一：增强for循环
        for (Object o : col) {
            System.out.println(o);
        }
        System.out.println("------------------");
        //方式二：iterator
        Iterator it = col.iterator();
        while (it.hasNext()) {//boolean类型
            System.out.println(it.next());
        }


    }
}
