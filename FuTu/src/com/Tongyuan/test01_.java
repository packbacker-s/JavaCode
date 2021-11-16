package com.Tongyuan;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/11/03
 * @Time:11:06
 */
public class test01_ {
    public static int reserveNum(int num) {
        int a = num > 0 ? num : -num;
        int sum = 0;
        while (a > 0) {
            sum = sum * 10 + (a % 10) ;
            a /= 10;
        }
        if (num < 0) {
            return -sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        int res = reserveNum(123);
        int res1 = reserveNum(-123);
        int res2 = reserveNum(-123400);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }
}
