package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/26
 * @Time:12:17
 */
public class test0014_LongestCommonPreFix {
    public static String longestCommonPreFix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        char[] chars = strs[0].toCharArray();
        int count = Integer.MAX_VALUE;
        for (String str: strs) {
            char[] temp = str.toCharArray();
            int index = 0;
            while (index < chars.length && index < temp.length) {
                if (chars[index] == temp[index]) {
                    index++;
                } else {
                    break;
                }
            }
            count = Math.min(index, count);
        }
        return strs[0].substring(0, count);
    }
}
