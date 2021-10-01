package com.niuke.code;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 *每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * [
 *   [1,2,8,9],
 *   [2,4,9,12],
 *   [4,7,10,13],
 *   [6,8,11,15]
 * ]
 *
 *
 * 给定 target = 7，返回 true。
 * 给定 target = 3，返回 false。
 * @User:Mingaho
 * @Date:2021/04/22
 * @Time:21:26
 */

/*public class Solution {   从左下开始查找  上面小  右边大
    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int i=rows-1,j=0;
        while(i>=0 && j<cols){
            if(target<array[i][j])
                i--;
            else if(target>array[i][j])
                j++;
            else
                return true;
        }
        return false;
    }
}*/
public class Main1 {
    public boolean isExistTarget(int target,int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[i][j] == target) {
                   return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][4];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int target;
        target = scanner.nextInt();
        Main1 main1 = new Main1();
        boolean flag = main1.isExistTarget(target, array);
        System.out.println(flag);
    }
}
