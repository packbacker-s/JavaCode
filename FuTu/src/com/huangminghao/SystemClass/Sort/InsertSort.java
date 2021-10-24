package com.huangminghao.SystemClass.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/23
 * @Time:21:10
 */
public class InsertSort {
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {//无数 或者只有一个数
            return;
        }
        for (int i = 1; i < arr.length; i++) {//0 - i做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 5, 3};
        insertSort(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
