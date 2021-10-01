package com.niuke.code;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n≤39
 *
 * @User:Mingaho
 * @Date:2021/04/27
 * @Time:20:09
 */
public class Main7 {
    public int Fibonacci(int n) {
        int[] fn = new int[100];
        fn[0] = 1;
        fn[1] = 1;
        int i;
        for(i = 2; i <= 39; i++) {
            fn[i] = fn[i - 1] + fn[i - 2];
            /*if (fn[i] < 0) {
                break;
            }*/
        }
        return fn[n];
    }

    public static void main(String[] args) {
        Main7 main4 = new Main7();
        int ret = main4.Fibonacci(39);
        System.out.println(ret);
    }
}
