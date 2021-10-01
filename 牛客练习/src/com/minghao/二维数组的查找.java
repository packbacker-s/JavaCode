package com.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 在一个二维数组array中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [
 * [1,2,8,9],
 * [2,4,9,12],
 * [4,7,10,13],
 * [6,8,11,15]
 * ]
 * 给定 target = 7，返回 true。
 *
 * 给定 target = 3，返回 false。
 *
 * 0 <= array.length <= 500
 * 0 <= array[0].length <= 500
 *
 *
 * @User:Mingaho
 * @Date:2021/08/26
 * @Time:11:06
 */
public class 二维数组的查找 {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        int i = row - 1;
        int j = 0;
        while (i >= 0 && j < col) {
            if (target < array[i][j]) {
                i--;
            }else if (array[i][j] > target) {
                j++;
            }else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
