package com.huangminghao.test01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/03
 * @Time:11:50
 */
public class Test01_HashMap {
    /**
     * 增加put(K key, V value)
     * 删除clear()   remove(Object key)
     * 修改
     * 查看 entrySet()  get(Object key)  keySet()  size()  values()
     * 判断containsKey(Object key) containsValue(Object value)
     *   equals(Object o)  isEmpty()
     */


    public static void main(String[] args) {
        //创建map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("lili", 100001);
        map.put("lulu", 100002);
        map.put("nana", 100003);
        map.put("feifei", 100004);
        map.put("lili", 100005);
        /*map.clear();*/
        /*map.remove("feifei");*/
        System.out.println(map.containsKey("nana"));
        System.out.println(map.containsValue(100004));
        System.out.println(map.size());
        System.out.println(map);



        Map<String, Integer> map2 = new HashMap<>();
        map2.put("lili", 100001);
        map2.put("lulu", 100002);
        map2.put("nana", 100003);
        map2.put("feifei", 100004);
        map2.put("lili", 100005);
        /*map.clear();*/
        /*map.remove("feifei");*/
        System.out.println(map2.containsKey("nana"));
        System.out.println(map2.containsValue(100004));
        System.out.println(map2.size());
        System.out.println(map2);

        System.out.println(map == map2);
        System.out.println(map.equals(map2));

        System.out.println("--------------");
        System.out.println(map.isEmpty());

        System.out.println("==============");

        System.out.println(map.get("nana"));
        System.out.println("-------------");

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("================");
        Collection<Integer> values = map.values();
        for (Integer i : values) {
            System.out.println(i);
        }

        Set<String> set2 = map2.keySet();
        for (String s : set2) {
            System.out.println(map.get(s));
        }

        System.out.println("------------");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e);
            /*System.out.println("-=-=-=-=-=-");
            System.out.println(e.getKey() + "---" + e.getValue());*/
        }
    }
}
