package com.huangminghao.test01;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/02
 * @Time:8:43
 */
public class Test01_Generic {
    public static void main(String[] args) {
        //创建一个ArrayList集合，向这个集合存入成绩
        ArrayList<Integer> al = new ArrayList<>();
        al.add(98);
        al.add(32);
        al.add(67);
        al.add(88);
        al.add(90);
        al.add(56);
        al.add(78);
        /*al.add("小丽");
        al.add(9.8);*/
        //对集合遍历查看
        /*for (Object o : al) {
            System.out.println(o);
        }*/

        for (Integer i : al) {
            System.out.println(i);
        }
    }
}
