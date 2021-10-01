package com.niuke.code;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * 示例1
 * 输入
 * [1,2,3,4,5],[4,3,5,1,2]
 * 返回值
 * false
 *
 * 思路不难：首先
 * 1、题目让我们判断在给定的两个数组，数组pushA是栈的压入顺序，判断数组popA是否是pushA的出栈顺序
 * 2、我们利用栈的思想，利用一个栈stack，将数组pushA的数值一个一个压入栈中，【定义popIndex = 0  popA的下标】，每压入一次，判断stack.peek()是否等于出栈顺序的值（即popA[popIndex]的值）
 * 3、若相等，将stack.pop()，然后进行popIndex++,同时在保证stack非空，继续判断stack.peek()是否等于出栈顺序（即popA[popIndex]的值，
 * 4、循环都结束后，最后判断stack是否为空，若是空，则说明popA是pushA的出栈顺序
 * @User:Mingaho
 * @Date:2021/04/28
 * @Time:15:46
 */
public class Main21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int popIndex = 0;
        int i = 0;
        while(i < pushA.length) {
            stack.push(pushA[i++]);
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
