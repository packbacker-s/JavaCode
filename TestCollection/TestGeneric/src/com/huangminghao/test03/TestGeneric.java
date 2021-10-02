package com.huangminghao.test03;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/02
 * @Time:10:13
 */
public class TestGeneric<A, B, C> {
    A age;
    B name;
    C sex;
    public void a(A m, B n, C x) {
    }

    public TestGeneric() {
        //泛型的构造器
        //不能带<A, B, C>
    }

    public void b() {//不同的泛型引用类型 不能赋值
        /*ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new A();
        list1 = list2;*/
    }




}
