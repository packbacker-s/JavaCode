package com.huangminghao.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/01
 * @Time:18:09
 */
public class Test01_CollectionMethods {
    public static void main(String[] args) {
        /**
         * collection的常用方法
         * 增加 add
         * 删除 clear
         *修改
         * 查看 iterator()  size()
         * 判断contains(object o)  equals(object o)  isEmpty()
         */

        //创建对象
        Collection col = new ArrayList<>();
        //调用方法
        //集合有一个特点，只能存方引用类型，不能是基本数据类型
        //基本数据类型自动装箱，对应包装类 int -> Integer
        col.add(18);
        col.add(12);
        col.add(15);
        col.add(11);
        System.out.println(col); //[18, 12, 15, 11]

        List list = Arrays.asList(new Integer[]{11, 14, 18, 30});
        col.addAll(list);
        System.out.println(col);//[18, 12, 15, 11, 11, 14, 18, 30]


        //col.clear();
        System.out.println(col);
        System.out.println("集合数量为：" + col.size());
        System.out.println("集合是否为空：" + col.isEmpty());

        boolean isRemove = col.remove(15);
        System.out.println(col);
        System.out.println("集合数据是否被删除: " + isRemove);


        Collection col2 = new ArrayList<>();
        col2.add(22);
        col2.add(15);
        col2.add(7);
        col2.add(11);

        Collection col3 = new ArrayList<>();
        col3.add(22);
        col3.add(15);
        col3.add(7);
        col3.add(11);
        System.out.println(col2.equals(col3));//比较值 true
        System.out.println(col2 == col3);//比较地址  false

        System.out.println("是否包含元素：" +  col3.contains(17));
    }
}
