package com.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/29
 * @Time:11:43
 */
public class 数组中超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length <= 0) {
            return 0;
        }
        int ret = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if (times == 0) {
                ret = array[i];
                times = 1;
            } else if (ret == array[i]) {
                times++;
            } else {
                times--;
            }
        }
         times = 0;
         for (int i = 0; i < array.length; i++) {
             if (ret == array[i]) {
                 times++;
             }
         }
         if (times * 2 > array.length) {
             return ret;
         }else {
             return 0;
         }
    }
}
