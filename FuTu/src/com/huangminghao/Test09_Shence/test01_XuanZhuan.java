package com.huangminghao.Test09_Shence;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/22
 * @Time:21:27
 */
public class test01_XuanZhuan {
    public static void XuanZhuan(int[][] array) {
        if (array == null) {

        }
        for (int i = 0; i < array[0].length; i++) {
            for (int j = array.length - 1; j > -1; j--) {
                System.out.println(array[j][i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for(int i = 0; i < n; i++){//输入一个二维数组
            for(int j = 0; j < n; j++){
                array[i][j] = sc.nextInt();
            }
        }

        XuanZhuan(array);
    }
}
