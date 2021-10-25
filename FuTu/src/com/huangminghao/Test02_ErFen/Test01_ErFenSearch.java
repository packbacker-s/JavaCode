package com.huangminghao.Test02_ErFen;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 *
 * @User:Mingaho
 * @Date:2021/10/10
 * @Time:18:00
 */
public class Test01_ErFenSearch {



    //在有序数组中找到num，有返回true 无返回false
    public static boolean findTheNumber(int[] arr, int num) {
        //保证数组有序，二分查找
        if (arr == null || arr.length == 0) {
            return false;
        }
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == num) {//第一种情况
                return true;
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return false;
    }



    //找有序数组中大于num的最左 位置 [1 2 3 4 5 6 7 8 9] num ->7
    //                    index= 0 1 2 3 4 5 6 7 8  retIndex = 7
    //第一次 [6 7 8 9] num ->7

    public static int findIndexOfLeft(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int l = 0;
        int r = arr.length - 1;
        int retIndex = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= num) {
                retIndex = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return retIndex;
    }




    //找有序数组中小于num的最you 位置 [1 2 3 4 5 6 7 8 9] num ->7
    //                    index=  0 1 2 3 4 5 6 7 8  retIndex = 7
    //第一次 [6 7 8 9] num ->7

    public static int findIndexOfRight(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int l = 0;
        int r = arr.length - 1;
        int retIndex = -1;
        while (l <= r) {
            int mid = (l + r) / 2;//mid = l + ((r - l) >> 1);
            if (arr[mid] <= num) {
                l = mid + 1;
            } else {
                retIndex = mid;
                r = mid - 1;
            }
        }
        return retIndex;
    }



    //局部最小值问题   局部最小；比左右的值都小
    //找出一个局部最小就行
    // 数组无序，但是相邻的数不相等
    public static int findOneMinIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int N = arr.length;
        if (N == 1) {
            return 0;
        }
        if (arr[0] < arr[1]) {//观察最左边两个数
            return 0;
        }
        if (arr[N - 1] < arr[N - 2]) {//观察最右边两个数
            return N - 1;
        }

        //arr大于二的时候
        int L = 0;
        int R = N - 1;
        while (L < R - 1) {
            int mid = (L + R) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return mid;
            } else {

                if (arr[mid] > arr[mid - 1]) {//1、左 > 我   我 > 右
                    R = mid - 1;              //2、左 < 我   我 < 右
                } else {                      //3、左 < 我   我 > 右
                    L = mid + 1;              //2 3情况
                }

            }
        }
        return arr[L] < arr[R] ? L : R;
    }


    //TODO:生成一个随机数组，且相邻数不相等
    public static int[] randomArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);//随即长度
        int [] arr = new int[len];
        if (len > 0) {
            arr[0] = (int)(Math.random() * maxValue);
            for (int i = 1; i < len; i++) {//相邻位置数字不同
                do {
                    arr[i] = (int)(Math.random() * maxValue);
                }while (arr[i] == arr[i - 1]);
            }
        }
        return arr;
    }

    //用于测试
    public static boolean check(int[] arr, int minIndex) {
        if (arr.length == 0) {
            return minIndex == -1;
        }
        int left = minIndex - 1;
        int right = minIndex + 1;
        boolean leftBigger = left >= 0 ? arr[left] > arr[minIndex] : true;
        boolean rightBigger = right < arr.length ? arr[right] > arr[minIndex] : true;
        return leftBigger && rightBigger;
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int maxLen = 10;
        int maxValue = 200;
        int testTime = 100_0000;
        System.out.println("测试开始！！");
        for (int i = 0; i < testTime; i++) {
            int[] arr = randomArray(maxLen, maxValue);
            int retIndex = findOneMinIndex(arr);
            if (!check(arr, retIndex)) {
                printArray(arr);
                System.out.println(retIndex);
                break;
            }
        }
        System.out.println("测试结束！！");
    }
}
