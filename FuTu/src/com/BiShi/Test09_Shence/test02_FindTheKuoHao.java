package com.BiShi.Test09_Shence;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *给定一个字符串，打印里面匹配的括号的个数和下标，比如:
 * (1)23(4()5)6
 * 一共有三对括号，0和2是一对，5和10是一-对，7和8是- -对。
 * 输入数据的括号均能成对出现，以下输入是不存在的:
 * |(
 * ((1)
 * (两个左括号有一个无法成对)
 * 输入描述:
 * 个包含数字和括号的字符串，一 -行
 * @User:Mingaho
 * @Date:2021/10/22
 * @Time:21:28
 */
public class test02_FindTheKuoHao {
    /*public static int CountTheKuoHaoNum(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        //因为不存在括号非法情况
        for (char c : chars) {
            if (c == '(' || c == ')') {
                count++;
            }
        }
        return count/2;
    }*/

    public static void CountAndFindIndex(String str) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
                stack.push(i);
            } else if (str.charAt(i) == ')') {
                int n = stack.peek();
                map.put(n, i);
                stack.pop();
            }
        }
        System.out.println(count);
        for (Map.Entry<Integer, Integer> vo : map.entrySet()) {
            System.out.println(vo.getKey());
            System.out.println(vo.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        CountAndFindIndex(str);
    }
}
