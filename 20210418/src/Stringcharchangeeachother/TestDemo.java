package Stringcharchangeeachother;

import sun.nio.cs.ArrayEncoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/18
 * @Time:20:14
 */
public class TestDemo {

    public static String reverse(String str, int begin, int end) {
        char[] value = str.toCharArray();
        while (begin < end) {
            char temp = value[begin];
            value[begin] = value[end];
            value[end] = temp;
            begin++;
            end--;
        }
        //return new String(value);
        return String.copyValueOf(value);
    }

    public static String func(String str, int n) {
        if(str == null || n <= 0 || n >= str.length()) {
            return null;
        }
        str = reverse(str,0,n - 1);
        str = reverse(str,n,str.length() - 1);
        str = reverse(str,0,str.length() - 1);
        return str;
    }

    /*
    String  和  StringBuilder 及 StringBuffer的区别：
    1、String的拼接会产生大量的临时对象，StringBuilder和StringBuffer不会
    2、String拼接会被优化为StringBuilder的append();
    3、后两者当中有一些方法是String不具备的，逆置方法

    String和StringBuilder一般用于单线程
    StringBuffer一般多用于多线程情况下
    StringBuilder 和 StringBuffer的区别
     */

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("abcd");
        str.append("efg");
        System.out.println(str);
    }

    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        str = func(str,n);
        System.out.println(str);
    }

    public static void main7(String[] args) {   //字符串的反转
        String str = "abcdefg";
        int len = str.length();
        String ret = reverse(str,0,len - 1);
        System.out.println(ret);

    }


    public static void main6(String[] args) {//字符串变换大小写
        String str = "abCDEfg";
        String str1 = str.toLowerCase();
        System.out.println(str1);
        String str2 = str.toUpperCase();
        System.out.println(str2);
    }

    public static void main5(String[] args) {
        String str1 = "abcdefgabcabcabcacb";
        String ret = str1.replace('a', 'z');  //将‘a'变为’z'
        System.out.println(ret);
        String ret1 = str1.replace("ab", "12"); //将“ab”都变为“12“
        System.out.println(ret1);

        String ret2 = str1.replaceFirst("ab", "12");
        System.out.println(ret2);      //第一次出现的ab  替换成  12

        String str2 = str1.substring(1);//左闭  右开        str1.substring(1， 5) -> [1, 4]
        System.out.println(str2);


        String str3 = "   abcdefg  abc  abcab  cacb";
        String ret3 = str3.trim();            //去掉前面的空格
        System.out.println(ret3);   //abcdefg  abc  abcab  cacb
    }


    public static void main4(String[] args) {
        String str1 = "ABCDefg";
        String str2 = "abcdefg";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //比较大小
        System.out.println(str1.compareTo(str2));
        //str1 > str2   正数
        //str1 < str2   负数
        //str1 = str2   0
    }

    public static void main3(String[] args) {
        byte[] bytes = {97, 98, 99, 100};
        String str = new String(bytes);//字节数组 转为 字符串
        System.out.println(str);

        String str1 = new String(bytes,1,2);
        System.out.println(str1);

        String str2 = "abcdefg";
        byte[] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes1));

    }

    /**
     * 判断一个字符串是否都是由数字组成的
     * @param
     */
    public static boolean func(String str) {
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str = "1234567890";
        boolean flat = func(str);
        System.out.println(flat);
    }

    public static void main1(String[] args) {
        char[] val = {'a', 'b', 'c', 'd', 'e'};
        String str1 = new String(val);                  //字符数组中的所有内容转为字符串
        String str = new String(val,1, 3);  //字符数组的内容转为字符串
        System.out.println(str);
        System.out.println(str1);

        String str2 = "hello";
        char ch = str2.charAt(1);                       //取得指定索引下标的字符 索引从0开始
        System.out.println(ch);

        //字符串 转 字符串数组
        String str3 = "nice to meet you";
        char[] val2 = str3.toCharArray();               //将字符串 转为 字符数组
        System.out.println(Arrays.toString(val2));

    }
}
