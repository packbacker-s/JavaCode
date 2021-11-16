package com.BiShi.TongYuanRuanKong;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/30
 * @Time:20:04
 */
public class test04_TheOnly_oneTimes_Num {
    public static int theOnly_oneTimes_Num(int[] arr) {
        int res = 0;
        for (int value : arr) {
            res = res ^ value;
        }
        return res;
    }

    public static int theOnly_oneTimes_Num2(int[] arr) {
        //已知数组存在一个唯一的数，其余的数都出现了三次
        //头尾指针l r
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((mask & arr[j]) != 0) {
                    count++;
                }
            }
            if (count % 3 == 1) {
                res = mask | res;
            }
        }
        return res;
    }

    public static int theOnly_oneTimes_Num3(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, true);
            } else {
                map.put(a, false);
            }
        }
        Set<Integer> set = map.keySet();
        for (int a : set) {
            if (map.get(a) == false) {
                return a;
            }
        }
        return 0;
    }

    public static int theOnly_oneTimes_Num4(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                i += 2;
            } else {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }


    public static void main(String[] args) {
        int[] arr = {0,0,0,5};
        int res = theOnly_oneTimes_Num2(arr);
        System.out.println(res);


        System.out.println("===============");
        int[] arr1 = {1,2,2,2,1,1,4,4,4,9,5,5,6,5,6,6};
        int res1 = theOnly_oneTimes_Num3(arr1);
        System.out.println(res1);

        System.out.println("===============");
        int[] arr3 = {1,2,2,2,1,1,4,4,4,9,5,5,6,5,6,6};
        int res3 = theOnly_oneTimes_Num3(arr3);
        System.out.println(res3);

    }
}
