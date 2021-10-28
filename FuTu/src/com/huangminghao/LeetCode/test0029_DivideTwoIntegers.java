package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/27
 * @Time:9:07
 */
public class test0029_DivideTwoIntegers {
    //a + b
    // a^b就是ab的无进位相加  (a&b)<<1就是ab进位相加结果
    public static int add(int a, int b) {
        int sum = a;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }

    //-b => b取反+1
    public static int neg(int n) {
        return add(~n, 1);
    }

    //a - b => a + (-b)   (-b) => ~b + 1 => add(~b, 1)
    public static int minus(int a, int b) {
        return add(a, neg(b));
    }

    //跟我们平常的乘法计算一样
    public static int multi(int a, int b) {
        int res = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                res = add(res, a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return res;
    }


    public static boolean isNeg(int n) {
        return n < 0;
    }
    public static int div(int a, int b) {
        int x = isNeg(a) ? neg(a) : a;//将负数变为正数运算
        int y = isNeg(b) ? neg(b) : b;
        int res = 0;
        for (int i = 31; i > neg(1); i = minus(i, 1)) {//minus(i - 1) -> i--;
            if ((x >> i) >= y) {
                res |= (1 << i);
                x = minus(x, y << i);
            }
        }
        return isNeg(a) ^ isNeg(b) ? neg(res) : res;
    }

    public static int divide(int a, int b) {
        if (b == Integer.MIN_VALUE) {
            return a == Integer.MIN_VALUE ? 1 : 0;
        }
        //走到这就证明b不是系统最小了
        if (a == Integer.MIN_VALUE) {
            if (b == neg(1)) {  //b == -1
                return Integer.MAX_VALUE;
            }
            int res = div(add(a, 1), b);
            return add(res, div(minus(a, multi(res, b)), b));
        }

        //ab都不是系统最小
        return div(a, b);
    }


    public static String printNumToString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            sb.append(((n >> i) & 1) == 0 ? '0' : '1');
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(add(6, 6));
        System.out.println(minus(6, 6));
        System.out.println(multi(6, 6));
        System.out.println(divide(-2147483648, 8));
        System.out.println(printNumToString(-2147483648));
    }

}
