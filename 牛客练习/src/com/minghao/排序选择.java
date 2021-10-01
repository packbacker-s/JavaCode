package com.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/29
 * @Time:20:04
 */
public class 排序选择 {
    public int [] SelectSort(int [] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {//执行多少趟
            int maxIndex = i;
            for (int j = i + 1; j < len - 1; j++) {//找最大的下标 // 每轮需要比较的次数 len-i
                if (array[maxIndex] < array[j]) {
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                int temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
        return array;
    }
}
