package com.huangminghao.Test06_youzan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/16
 * @Time:15:54
 */
public class test01_TheMostPoints {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 输入n，输出生成有效括号数
     * @param n int整型
     * @return int整型
     */
    public static int generateParenthesis (int n) {
        // write code here
        List<String> list = new ArrayList<>();
        int count = PutTheLeftAndRightKuoHao((ArrayList<String>) list, n, n);
        return count;
    }
    public static int PutTheLeftAndRightKuoHao(ArrayList<String> list, int left, int right) {
        int count = 0;
        while (left != 0 || right != 0) {
            if (left > 0) {
                PutTheLeftAndRightKuoHao(list, left - 1, right);
                list.add("(");
            }
            if (right > left) {
                PutTheLeftAndRightKuoHao(list, left, right - 1);
                list.add(")");
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
