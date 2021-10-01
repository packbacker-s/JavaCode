package com.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/30
 * @Time:14:40
 */
public class SelectSort {
    public int[] selectSort(int[] array) {
        int len = array.length;
        for(int i = 0; i < len - 1; i++) {
            int maxPos = i;
            for(int j = i + 1; j < len; j++) {
                if(array[j] > array[maxPos]) {
                    maxPos = j;
                }
            }
            if(i != maxPos) {
                int temp = array[i];
                array[i] = array[maxPos];
                array[maxPos] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {4, 8, 9, 0, 5, 32, 34, 12, 54, 1, 2};
        int len = array.length;
        int[] arr = new int[len];
        SelectSort selectSort = new SelectSort();
        arr = selectSort.selectSort(array);
        System.out.println(Arrays.toString(arr));
    }
}
