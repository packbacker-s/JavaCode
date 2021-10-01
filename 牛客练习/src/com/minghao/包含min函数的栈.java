package com.minghao;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/28
 * @Time:16:31
 */
public class 包含min函数的栈 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (stackMin.isEmpty() || node <= stackMin.peek()) {
            stackMin.push(node);
        }
    }

    public void pop() {
        if (stack.isEmpty() || stackMin.isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        int temp = stack.pop();
        if (temp == stackMin.peek()) {
            stackMin.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        return stack.peek();
    }

    public int min() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("stack is empty!");
        }
        return stackMin.peek();
    }
}
