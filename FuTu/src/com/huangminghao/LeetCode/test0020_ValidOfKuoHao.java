package com.huangminghao.LeetCode;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/26
 * @Time:19:22
 */
public class test0020_ValidOfKuoHao {

    //多种括号的匹配
    public static boolean ValidOfKuoHao (String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if ((c == '(' && chars[i] != ')') || (c == '{' && chars[i] != '}') || (c == '[' && chars[i] != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //单种括号问题 例如括号为() 直接使用计数器
    public static boolean ValidOfKuoHao2(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(')
                count++;
            else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        String str1 = ")()()(";
        String str2 = "(()())";
        System.out.println(ValidOfKuoHao2(str1));
        System.out.println(ValidOfKuoHao2(str2));
    }
}
