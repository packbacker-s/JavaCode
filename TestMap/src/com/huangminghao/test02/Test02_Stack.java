package com.huangminghao.test02;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/04
 * @Time:11:09
 */
public class Test02_Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("a");
        stack.add("b");
        stack.add("c");
        stack.add("d");
        System.out.println(stack);

        stack.push("e");//与add方法功能一样，但是返回值不同
        stack.push("f");
        stack.push("g");
        System.out.println(stack);
    }
}
