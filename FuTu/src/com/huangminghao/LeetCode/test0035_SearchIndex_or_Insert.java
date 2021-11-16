package com.huangminghao.LeetCode;

import com.sun.webkit.dom.DocumentFragmentImpl;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/28
 * @Time:10:23
 */

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，
 * 返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。TODO:二分查找
 * 示例 1:
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class test0035_SearchIndex_or_Insert {
    public static int searchIndex_or_Insert(int[] arr, int target) {
        int index = -1;
        if (arr.length == 1) {
            if (arr[0] < target) {
                index = 1;
            } else {
                index = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[0] > target) {
                index = 0;
                break;
            } else if (arr[i] < target && arr[i + 1] > target) {
                index = i + 1;
                break;
            } else if (target > arr[arr.length - 1]) {
                index = arr.length;
                break;
            }
        }


        return index;
    }
}
