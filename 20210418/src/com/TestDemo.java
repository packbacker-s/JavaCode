package com;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * C语言没有字符串类型
 * @User:Mingaho
 * @Date:2021/04/18
 * @Time:15:54
 */
class Person {
    private int age;
}
public class TestDemo {


    public static void main(String[] args) {
        String str = "192.168.1.1";
        String[] string = str.split("\\.");
        for (String s: string) {
            System.out.println(s);          //点号分割  不打印任何东西  需要用\\    .&|(){[*+
        }                        //多个分割的话  “ |-|#”  需加空格和|
        String str1 = "name=zhangsan&age=18";
        String[] string1 = str1.split("=");
        for (String s1:string1) {
            String[] string2 = s1.split("&");
            for (String s2:string2) {
                System.out.println(s2);
            }
        }
    }
    /**
     * 字符串的拆分
     *
     * @param args
     */
    public static void main12(String[] args) {
        String str = "abc de f";
        String[] string = str.split(" ", 2);//分为2组
        for (String s: string) {
            System.out.println(s);
        }
    }


    public static void main11(String[] args) {
        String str = "ababcdefgabcabc";
        //int index = str.indexOf("bcd");  // 出现的位置 3
        //int index = str.indexOf('a');  出现的位置 0
        int index = str.indexOf("ef",4);//从4开始找 不管从哪个地方开始找 位置都是从0开始计数
        System.out.println(index);  //  6

        //int index1 = str.lastIndexOf('a');    //12  从后往前找 但还是从0开始计数
        int index1 = str.lastIndexOf("abc", 3);//3在b位置 往前找虽没有abc
        System.out.println(index1);

        boolean flg = str.startsWith("abc",2); //2为偏移位置
        System.out.println(flg);  ///true
    }

    public static void main10(String[] args) {   //是否含有 “子” 字符串
        String str = "abcdefgabcabc";
        boolean flag = str.contains("abc1");
        System.out.println(flag);


    }


    public static void main9(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //利用反射 -》自省的过程  反射
        String str = "Hello";
        Class c1 = String.class;
        Field field = c1.getDeclaredField("value");
        field.setAccessible(true);

        char[] val = (char[]) field.get(str);
        val[0] = 'g';
        System.out.println(str);
    }

    public static void main8(String[] args) {
        String str = "Hello";
        str = "h" + str.substring(1);
        System.out.println(str);
    }

    /**
     *
     * 理解String 不可变
     * @param args
     */
    public static void main7(String[] args) {
        String str = "hello";
        str = str + "world";
        str = str + "!!!";
        System.out.println(str);

        for(int i = 0; i < 1000; i++) {
            str += 1;   //可不敢这样拼接字符串  使用StringBuffer  StringBuilder
        }
    }

    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);

    }


    public static void main5(String[] args) {
        String str1 = "hello";

        System.out.println(str1.equals("hello"));//不建议这样写  str1不清楚是否为null

        System.out.println("hello".equals(str1));//此方法居多  因为equals里面可以为null
    }


    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "hello";
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }


    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo"; //编译时期就变成hello
        System.out.println(str1 == str2);//true

        String str3 = new String("hel") + "le";
        System.out.println(str1 == str3);//false
    }

    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//false

        String str3 = "hello";
        System.out.println(str1 == str3);//true
    }

    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);

        String str2 = new String("asfsdf");
        System.out.println(str2);

        char[] var = {'2', 'v', 'b', 'h', 'j'};
        String str3 = new String(var);
        System.out.println(str3);
    }
}
