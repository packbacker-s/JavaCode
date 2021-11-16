package com.huangminghao.AboutNothingTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/11/02
 * @Time:10:00
 */
public class test02_NFind_TheLast_One {
    public static int nFind_TheLast_One(int[] arr, int m) {
        boolean[] bool = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            bool[i] = true;
        }
        int leftCount = arr.length;
        int count = 0;
        int index = 0;
        while (leftCount > 1) {
            if (bool[index]) {
                count++;
                if (count == 3) {
                    count = 0;
                    leftCount--;
                    bool[index] = false;
                }
            }
            index++;
            if (index == arr.length) {
                index = 0;
            }
        }
        int res = -1;
        for (int i = 0; i < bool.length; i++) {
            if (bool[i]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int res = nFind_TheLast_One(arr, 3);
        System.out.println(res);
    }
}
