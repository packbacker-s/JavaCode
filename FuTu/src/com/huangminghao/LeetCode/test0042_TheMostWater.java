package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/28
 * @Time:8:53
 */
public class test0042_TheMostWater {
    public static int theMostWater(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        int n = arr.length - 1;
        int leftMax = arr[0];
        int l = 1;
        int r = n - 1;
        int rightMax = arr[n];
        int water = 0;
        while (l <= r) {
            if (leftMax <= rightMax) {
                water += Math.max(0, leftMax - arr[l]);
                leftMax = Math.max(leftMax, arr[l++]);
            } else {
                water += Math.max(0, rightMax - arr[r]);
                rightMax = Math.max(rightMax, arr[r--]);
            }
        }
        return water;
    }
}
