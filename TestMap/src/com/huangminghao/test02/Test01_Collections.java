package com.huangminghao.test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/04
 * @Time:10:50
 */
public class Test01_Collections {
    /**
     * Collections集合类
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cc");
        list.add("bb");
        list.add("aa");
        System.out.println(list);
        Collections.addAll(list, "dd", "ee", "ff");
        Collections.addAll(list, new String[] {"gg", "oo", "pp"});
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"cc"));//这个方法必须在有序中查找
        System.out.println("=============");

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"cc"));

        //copy替换方法  list2中替换到list中
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "tt", "ss");
        Collections.copy(list, list2);//将list2中替换到list中
        System.out.println(list);


        //fill填充
        Collections.fill(list2, "yy");
        System.out.println(list2);
    }
}
