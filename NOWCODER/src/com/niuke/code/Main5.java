package com.niuke.code;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * 栈1和 栈2  两个栈
 * 栈1用于push  用于队列的摆放以及数值node的插入，（也要保证栈2为空，都插入到栈1中）
 * 栈2用于push栈1 的数值，   随后将栈2一个一个都pop出去
 * @User:Mingaho
 * @Date:2021/04/27
 * @Time:19:07
 */
public class Main5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
