package com.niuke.code;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 示例1
 * 输入
 * [1,2,3,4]
 * 返回值
 * [1,3,2,4]
 * 示例2
 * 输入
 * [2,4,6,5,7]
 * 返回值
 * [5,7,2,4,6]
 * @User:Mingaho
 * @Date:2021/04/29
 * @Time:14:11
 */
public class Main13 {
    public int[] reOrderArray (int[] array) {
        int len = array.length;
        int jl = 0;
        for(int i = 0; i < len; i++) {
            if(array[i] % 2 != 0) {
                jl++;
            }
        }
        int ol = len - jl;
        int[] jishu = new int[jl];
        int[] oushu = new int[ol];
        int ji = 0;
        int ou = 0;
        for(int i = 0; i < len; i++) {
            if(array[i] % 2 != 0) {
                jishu[ji++] = array[i];
            }else {
                oushu[ou++] = array[i];
            }
        }
        for(int i = 0; i < ji; i++) {
            array[i] = jishu[i];
        }
        for(int j = 0; j < ou; j++) {
            array[ji++] = oushu[j];
        }
        return array;
    }
}
