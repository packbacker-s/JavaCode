package com.huangminghao.LeetCode;

import com.sun.javaws.IconUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/26
 * @Time:12:30
 */
public class test0015_ThreeOfSum {
    //数组中两数之和
    public static List<List<Integer>> twoOfSum (int[] arr, int begin, int k) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        //Arrays.sort(arr);
        //arr数组要保证已经是有序 （默认有序了）
        int l = begin;
        int r = arr.length - 1;
        List<List<Integer>> list = new ArrayList<>();
        int[][] array = new int[arr.length][2];
        while (l < r) {
             if (arr[l] + arr[r] < k) {
                l++;
            } else if (arr[l] + arr[r] > k){
                r--;
            } else {
                 if (l == begin || arr[l] != arr[l - 1]) {
                     List<Integer> cur = new ArrayList<>();
                     cur.add(arr[l]);
                     cur.add(arr[r]);
                     list.add(cur);
                 }
                 l++;
             }
        }
        return list;
    }

    public static List<List<Integer>> threeOfSum(int[] arr, int k) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        //第一个数选的位置
        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                List<List<Integer>> twoList = twoOfSum(arr, i + 1, - arr[i]);
                for (List<Integer> cur : twoList){
                    cur.add(0, arr[i]);
                    list.add(cur);
                }
            }
        }
        return list;
    }
    /*public static List<List<Integer>> twoOfSum1 (int[] arr, int begin, int k) {

        Arrays.sort(arr);
        int l = begin;
        int r = arr.length - 1;
        List<List<Integer>> list = new ArrayList<>();
        while (l < r) {
            if (arr[l] + arr[r] < k) {
                l++;
            } else if (arr[l] + arr[r] > k){
                r--;
            } else {
                if (l == 0 || arr[l] != arr[l - 1]) {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(arr[l]);
                    cur.add(arr[r]);
                    list.add(cur);
                }
                l++;
            }
        }
        return list;
    }*/

    public static void main(String[] args) {
        int[] arr = { -2, -1, 1, 2, 3, 4, 5};
        int k = 4;
        List<List<Integer>> list = twoOfSum(arr, 0, k);
        for (List res: list) {
            System.out.println(res);

        }
        //System.out.println(list);
    }
}
