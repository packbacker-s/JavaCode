package com.huangminghao.Test01_FuTu_BiShi;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 富途笔试
 *
 * @User:Mingaho
 * @Date:2021/10/10
 * @Time:15:43
 */
public class Test_01 {

        /**
         * return the maxfifference
         * @param arr int整型一维数组 the array
         * @return int整型
         */

        public int[] BubbleSort(int[] arr) {
            int len = arr.length;
            for (int i = 0; i < len - 1; i++) {
                for (int j = 0; j < len - 1 - i; j++) {
                    if (arr[j + 1] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }
        public int maxDistance (int[] arr) {
            // write code here
            int len = arr.length;
            int k = 0;
            int[] arr1 = new int [len];
            BubbleSort(arr);
            for (int i = 0; i < len - 1; i++) {
                arr1[k++] = arr[i] - arr[i + 1];
            }
            BubbleSort(arr1);
            //int[] arr2 = new int [len];
            //arr2 = BubbleSort(arr1);
            int a = arr1[0];
            return a;
        }

    public static void main(String[] args) {
            Test_01  test_01 = new Test_01();
            int [] arr = new int [5];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                arr[i] = scanner.nextInt();
            }
            int ret = test_01.maxDistance(arr);
        System.out.println(ret);

    }

}
