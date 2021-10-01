package com.minghao;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/28
 * @Time:16:58
 */
public class 栈的压入弹出序列 {
    public boolean IsPopOrder(int [] pushList, int [] popList) {
        Stack<Integer> stack = new Stack<>();
        if (pushList.length == 0 || popList.length == 0) {
            return false;
        }
        int i = 0;
        int popIndex = 0;
        while (i < pushList.length) {
            stack.push(pushList[i++]);
            while (!stack.isEmpty() && stack.peek() == popList[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
