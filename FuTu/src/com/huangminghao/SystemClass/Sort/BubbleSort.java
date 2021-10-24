package com.huangminghao.SystemClass.Sort;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/23
 * @Time:21:10
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//执行多少趟排序
            for (int j = 0; j < arr.length - 1 - i; j++) {//比较
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 5, 3};
        bubbleSort(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
