package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/25
 * @Time:20:15
 */
public class test0010_RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();


        return isValid(str, pattern) && process(str, pattern, 0, 0);

    }

    public static boolean isValid(char[] str, char[] pattern) {
        for (char c : str) {
            if (c == '.' || c == '*') {
                return false;
            }
        }
        for (int i = 0; i < pattern.length; i++) {
            if (pattern[i] == '*' && (i == 0 || pattern[i - 1] == '*')) {
                return false;
            }
        }
        return true;
    }

    //str[si ..] 能被pattern[pi..]变出来
    //潜在：pi位置 pattern[pi] != *
    public static boolean process(char[] str, char[] pattern, int si, int pi) {
        if (si == str.length) {
            if (pi == pattern.length) {
                return true;
            }

            if (pi + 1 < pattern.length && pattern[pi + 1] == '*') {
                return process(str, pattern, si, pi + 2);
            }
            return false;
        }
        if (pi == pattern.length) {//pattern ""  -> str 也要 ""
            return si == str.length;
        }

        //si pi都没有终止
        if (pi + 1 >= pattern.length || pattern[pi + 1] != '*') {
            return (str[si] == pattern[pi] || pattern[pi] == '.') && process(str, pattern, si+1, pi+1);
        }
        //pi+1位置 -> '*'
        if ()
    }
}
