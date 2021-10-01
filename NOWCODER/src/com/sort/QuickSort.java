package com.sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/30
 * @Time:15:38
 */
public class    QuickSort {
    public void quickSort(int[] array, int low, int high) {
        if(low < high) {
            int i = low;
            int j = high;
            int temp = array[i];
            while (i < j) {
                while (i < j && array[j] <= temp) {
                    j--;
                }
                if(i < j) {
                    array[i] = array[j];
                }
                while (i < j && array[i] > temp) {
                    i++;
                }
                if(i < j) {
                    array[j] = array[i];
                }
            }
            array[i] = temp;
            quickSort(array, low, i - 1);
            quickSort(array,i + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5,4,6,0,9,8,7};
        int len = array.length;
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, len - 1);
        System.out.println(Arrays.toString(array));
    }
}
