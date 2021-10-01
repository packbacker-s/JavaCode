package huang.ming.hao;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/05/22
 * @Time:11:10
 */
public class TestDemo {


    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
    }

    public static void main5(String[] args) {
        Integer a = 10;  //自动装箱
        int b = a;       //自动拆箱
    }

    public static void main4(String[] args) {
        int i = 10;
        //装箱操作新建一个Integer类型对象，将i值放入对象的某个属性中
        Integer ii = Integer.valueOf(i);
        Integer ij = new Integer(i);

        //拆箱操作，将Integer对象中的值取出，放到一个基本数据类型中
        int j = ii.intValue();
        double d = ii.doubleValue();


    }

    public static void main3(String[] args) {
        Map<String, String> map = new HashMap<>();//Map<K, V>形式
        map.put("国民女神", "高圆圆");              //key不要重复，value可以重复
        map.put("国民老公", "王思聪");
        map.put("及时雨", "宋江");
        System.out.println(map);  //哈希表在打印数据的时候，打印的顺序不- -定是存储顺序。

        System.out.println("============");
        String s = map.get("及时雨");//get K  return V
        String s1 = map.getOrDefault("及时雨1", "minghao");//若无K值，则打印默认值
        System.out.println(s);
        System.out.println(s1);
        System.out.println("================");

        System.out.println(map.containsKey("及时雨"));
        System.out.println(map.containsValue("宋江"));
        System.out.println("===============");

        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String , String> entry: set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }

    public static void main2(String[] args) {
        Collection<Integer> collection = new Stack<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        System.out.println(collection);

        for (int a: collection
             ) {
            System.out.println(a);
        }
        System.out.println("===============");
        System.out.println("===============");

        /*System.out.println("=============");
        collection.clear();
        System.out.println(collection);*/

        System.out.println("==========");
        collection.remove(4);
        System.out.println(collection);

        System.out.println("==========");
        System.out.println(collection.isEmpty());

        System.out.println("=================");
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));

        System.out.println("===========");

    }




    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //Collection<Integer> collection1 = new ArrayList<>();
        //Collection collection1 = new LinkedList();
        collection.add("huang");
        collection.add("minghao");
        collection.add("huang");
        collection.add("ming");
        collection.add("hao");
        System.out.println(collection);

        //利用foreach打印
        for (String s:collection
             ) {
            System.out.println(s);
        }
        System.out.println("================");
        System.out.println("================");

        /*collection.clear();//清空集合
        System.out.println(collection);*/

        System.out.println(collection.isEmpty());//truer or false


        collection.remove("huang");//删除其中一个
        System.out.println(collection);

        System.out.println("===========");
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        System.out.println(collection.toArray());
        System.out.println(objects);
    }
}
