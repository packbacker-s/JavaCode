package com.niuke.code;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @User:Mingaho
 * @Date:2021/04/29
 * @Time:19:33
 */

public class Main19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix.length == 0) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int mincol = 0;
        int minrow = 0;
        int maxcol = matrix[0].length;
        int maxrow = matrix.length;
        int sum = maxrow * maxcol;
        int i,j;
        maxrow--;
        maxcol--;
        while(sum != 0) {
            for (i = mincol; i <= maxcol && sum != 0; i++) {
                list.add(matrix[minrow][i]);
                sum--;
            }
            minrow++;

            for (j  = minrow; j <= maxrow && sum != 0; j++) {
                list.add(matrix[j][maxcol]);
                sum--;
            }
            maxcol--;

            for (i = maxcol; i >= mincol && sum != 0; i--) {
                list.add(matrix[maxrow][i]);
                sum--;
            }
            maxrow--;

            for (j = maxrow; j >= minrow && sum != 0; j--) {
                list.add(matrix[j][mincol]);
                sum--;
            }
            mincol++;
        }
        return list;
    }
}
