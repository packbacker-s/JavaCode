package com.huangminghao.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/01
 * @Time:20:10
 */
public class Test01_ArrayList {
    public static void main(String[] args) {
        //接口=实现类
        Collection col = new ArrayList();
        List list = new ArrayList();
        //直接创建实现类对象
        ArrayList al = new ArrayList();

        System.out.println(al.add("abc"));
        System.out.println(al.add("def"));

        Vector v = new Vector();
    }
}
