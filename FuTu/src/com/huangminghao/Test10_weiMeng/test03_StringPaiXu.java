package com.huangminghao.Test10_weiMeng;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *给定一-个字符串string A和其长度n,返回所有该字符串所包含字符的各种
 * 排列。要求输入字符串长度小于等于11且均为大写英文字符，排列中的字
 * 符串按字典序从大到小排序。(重 复字符串不用合并)
 * 测试样例:
 * ”ABC"
 * 返回:
 * ["CBA", "CAB ","BCA", "BAC",", "ACB", "ABC"]
 *
 *
 * @User:Mingaho
 * @Date:2021/10/23
 * @Time:17:11
 */
public class test03_StringPaiXu {
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> getPermutation(String A) {
        // write code here
        if (A == null || A.length() == 0) {
            return res;
        }
        Permutation(A.toCharArray(), 0);
        Collections.sort(res);//ArrayList包含在集合工具类里
        Collections.reverse(res);
        return res;
    }

    public void Permutation(char[] strArr, int begin) {
        if (begin == strArr.length - 1) {
            String s = String.valueOf(strArr);
            if (!res.contains(s)) {
                res.add(s);
            } else {
                for (int i = begin; i < strArr.length; i++) {//交换
                    char temp = strArr[begin];
                    strArr[begin] = strArr[i];
                    strArr[i] = temp;
                    //swap(strArr, begin, i);
                    if (!res.contains(s)) {
                        res.add(s);
                    }
                }
            }
        }

    }
    public void swap(char[] strArr, int a, int b) {
        char temp = strArr[a];
        strArr[a] = strArr[b];
        strArr[b] = temp;
    }
}
