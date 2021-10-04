package com.huangminghao.test01;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/03
 * @Time:12:32
 */
public class Test02_TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("bilibili", 12345);
        map.put("anananan", 342323);
        map.put("degere", 2342423);
        map.put("ccccaa", 23212111);
        map.put("ccccaa", 111111);
        System.out.println(map.size());
        System.out.println(map);
    }
}
