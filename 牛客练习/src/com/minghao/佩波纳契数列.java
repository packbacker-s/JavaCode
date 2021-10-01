package com.minghao;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n≤39
 *
 * 示例1
 * 输入：
 * 4
 * 复制
 * 返回值：
 * 3
 * @User:Mingaho
 * @Date:2021/08/26
 * @Time:19:42
 */
public class 佩波纳契数列 {
    public int Fibonacci(int n) { //public static int Fibonacci(int n)
        if (n == 0) {
            return 1;
        }
        if (n ==1) {
            return 1;
        }
        int [] fn = new int[100];
        fn[0] = 1;
        fn[1] = 1;
        for (int i = 2; i <= n; i++) {
            fn[i] = fn[i - 2] + fn[i - 1];
        }
        return fn[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            佩波纳契数列 佩波纳契 = new 佩波纳契数列();
            int ret = 佩波纳契.Fibonacci(n);
            //int ret = Fibonacci(n);
            System.out.println(ret);
        }

    }
}
