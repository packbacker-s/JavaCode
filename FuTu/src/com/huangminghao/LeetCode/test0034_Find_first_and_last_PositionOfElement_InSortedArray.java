package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *TODO:给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 进阶：
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 * 示例 1
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @User:Mingaho
 * @Date:2021/10/27
 * @Time:15:17
 */

/**
 * TODO:就是找一个数字在数组中出现的最左最右的位置
 */
public class test0034_Find_first_and_last_PositionOfElement_InSortedArray {
    public static int[] find_first_and_last_PositionOfElement_InSortedArray(int[] arr, int target) {
        int[] res = {-1, -1};
        if (arr == null || arr.length == 0) {
            return res;
        }
        res[0] = findTheFirstIndex(arr, target);
        res[1] = findTheLastIndex(arr, target);
        return res;
    }

    public static int findTheFirstIndex(int[] arr, int target) {
        int index = -1;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] > target) {
                r = m - 1;
            } else if (arr[m] < target) {//arr[m] < target
                l = m + 1;
            } else {
                index = m;
                r = m - 1;
            }
        }
        return index;
    }

    public static int findTheLastIndex(int[] arr, int target) {
        int index = -1;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] < target) {
                l = m + 1;
            } else if (arr[m] > target) {//arr[m] < target
                r = m - 1;
            } else {
                index = m;
                l = m + 1;
            }
        }
        return index;
    }

    public static int[] findTheFirstAndLastIndex(int[] arr, int target) {
        int index1 = -1;
        int index2 = -1;
        int[] res = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index1 = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                index2 = i;
                break;
            }
        }
        res[0] = index1;
        res[1] = index2;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        //int[] res = find_first_and_last_PositionOfElement_InSortedArray(arr, 4);
        int[] res = findTheFirstAndLastIndex(arr, 8);
        System.out.println(res[0] + " " + res[1]);
    }
}
