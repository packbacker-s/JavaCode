package com.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/30
 * @Time:14:36
 */
public class BubbleSort {
    public int[] bubbleSort(int[] array) {
        int len = array.length;

        for(int i = 0; i < len - 1; i++) {
            boolean flag = false;
            for(int j = 0; j < len - 1 - i; j++) {
                if(array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {4, 8, 9, 0, 5 ,32, 34, 12, 54, 1, 9, 2};
        //bubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(array)));
    }
}
