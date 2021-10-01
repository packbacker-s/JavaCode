package com.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/29
 * @Time:19:47
 */
public class 排序冒泡 {
    public int [] BubbleSort(int [] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {//执行多少趟
            boolean flag = false;
            for (int j = 0; j < len - 1 - i; j++) {//两两比较
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return array;
    }
}
