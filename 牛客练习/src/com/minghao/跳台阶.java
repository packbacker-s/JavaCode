package com.minghao;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/27
 * @Time:9:46
 */
public class 跳台阶 {
    public int jumpFloor(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }else {
            return jumpFloor(n - 1) + jumpFloor(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            跳台阶 tiao = new 跳台阶();
            int ret = tiao.jumpFloor(n);
            System.out.println(ret);
        }
    }
}
