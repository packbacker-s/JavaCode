package com.huangminghao.SystemClass.ErFen;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:9:41
 */
public class JuBuZuiXiao {
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
}
