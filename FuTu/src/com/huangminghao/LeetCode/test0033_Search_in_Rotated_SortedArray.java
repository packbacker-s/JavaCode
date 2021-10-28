package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/27
 * @Time:12:10
 */

/**
 * TODO:整数数组 nums 按升序排列，数组中的值 互不相同 。
 *  在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了旋转，
 *  使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 *  （下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 *  给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 *  示例 1：
 *  输入：nums = [4,5,6,7,0,1,2], target = 0
 *  输出：4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class test0033_Search_in_Rotated_SortedArray {
    public static int search_in_Rotated_SortedArray(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;   // m = l + (r - l) / 2;
            if (arr[m] == num) {
                return m;
            }
            //arr[m] != num
            if (arr[m] == arr[l] && arr[m] == arr[r]) {
                while (l != m && arr[l] == arr[m]) {
                    l++;
                }
                if (l == m) {  //[l] [m]之间的数都一样
                    l = m + 1;
                    continue;
                }
            }
            //若在[l] [m] 之间出现不相等 即[l] [m] [r]不都一样
            if (arr[l] != arr[m]) {           //TODO:  l           m         r
                if (arr[m] > arr[l]) {  //        TODO:3   num?    5  num?   10的情况
                    if (num < arr[m] && num >= arr[l]) {  //TODO:3   num?    5
                        r = m - 1;
                    } else {                             //TODO:5   num?    10
                        l = m + 1;
                    }
                } else {//arr[m] < arr[l]           TODO:5  num?  3  num?   10的情况
                    if (num > arr[m] && num <= arr[r]) {   //TODO:3  num?   10
                        l = m + 1;
                    } else {                              //TODO:5  num?  3
                        r = m - 1;
                    }
                }
            } else {//TODO:表明[l] == [m] 即[m] != [r]
                if (arr[m] < arr[r]) {  //  3   num?      5    num?     10
                    if (num > arr[m] && num <= arr[r]) {
                        l = m + 1;
                    } else {
                        r = m - 1;
                    }
                } else {  //arr[m] > arr[r]的情况
                    if (num < arr[m] && num >= arr[l]) { //3   num?    10   num?   2
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
            }
        }
        return -1;
    }
}
