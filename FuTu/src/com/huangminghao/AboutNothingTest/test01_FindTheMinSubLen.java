package com.huangminghao.AboutNothingTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/30
 * @Time:15:53
 */
public class test01_FindTheMinSubLen {
    public static int findTheMinSubLen(int[] arr, int target) {
        int resLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int k = i;
            while (sum < target && k < 10) {
                sum += arr[k++];
            }
            resLen = Math.min(resLen, k - i + 1);
        }
        return resLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 3, 2, 1};
        int res = findTheMinSubLen(arr, 10);
        System.out.println(res);
    }
}
