package com.huangminghao.SystemClass.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/23
 * @Time:21:26
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 5, 3};
        selectSort(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
