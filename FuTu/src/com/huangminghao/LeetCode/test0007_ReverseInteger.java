package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/25
 * @Time:12:58
 */
public class test0007_ReverseInteger {
    public static int reverse(int x) {
        boolean neg = ((x >>> 31) & 1) == 1; //无符号右移 31位  就是符号位 判断是否是负数
        x = neg ? x : -x;//把x转化为负数
        int m = Integer.MIN_VALUE / 10;
        int o = Integer.MIN_VALUE % 10;
        int res = 0;
        while (x != 0) {
            if (res < m || res == m && x % 10 < o) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        return neg ? res : Math.abs(res);
    }

    public static void main(String[] args) {
        int x = -3726;
        int res = reverse(x);
        System.out.println(res);
    }
}
