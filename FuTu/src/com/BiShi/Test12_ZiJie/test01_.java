package com.BiShi.Test12_ZiJie;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:11:56
 */
public class test01_ {
    /**
     * 找出字符串第一个只出现一次的字符
     * @param str
     * @return
     */
    public static char findTheOnlyOneTime(String str) {
        char[] ch = str.toCharArray();
        //添加到数组中
        int[] arr = new int[26];
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i] - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[str.charAt(i) - 'a'] == 1) {  //判断 == 1 return
                return str.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = findTheOnlyOneTime(str);
        System.out.println(c);
    }
}

