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
        if (si == str.length) {   //si越界了
            if (pi == pattern.length) {
                return true;
            }

            if (pi + 1 < pattern.length && pattern[pi + 1] == '*') {
                return process(str, pattern, si, pi + 2);
            }
            return false;
        }

        //si没有越界  pi越界
        if (pi == pattern.length) {//pattern ""  -> str 也要 ""
            return si == str.length;
        }

        //si pi都没有越界
        if (pi + 1 >= pattern.length || pattern[pi + 1] != '*') {
            return (str[si] == pattern[pi] || pattern[pi] == '.') && process(str, pattern, si+1, pi+1);
        }


        //si没越界  pi没越界  pi+1 *
        //pi+1位置 -> '*'
        if (pattern[pi] != '.' && str[si] != pattern[pi]) {
            return process(str, pattern, si, pi + 2);
        }
        //pi+1 * si pi
        //?* 0份
        if (pattern[pi] != '.' && str[si] != pattern[pi]) {
            return true;
        }

        while (si < str.length && (str[si] == pattern[pi] || pattern[pi] == '.')) {
            if (process(str, pattern, si + 1, pi + 2)) {
                return true;
            }
            si++;
        }
        return false;
    }




    public static boolean isMatch2(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        char[] str = s.toCharArray();
        char[] pattern = p.toCharArray();
        int[][] dp = new int[str.length + 1][pattern.length + 1];
        for (int si = 0; si < str.length; si++) {
            for (int pi = 0; pi <= pattern.length; pi++) {
                dp[si][pi] = -1;
            }
        }
        //dp[si][pi] = -1, 参数组合没计算过
        //dp[si][pi] = 0, 参数组合计算过， 返回值为false
        //dp[si][pi] = 1, 参数组合计算过， 返回值为true
        return isValid(str, pattern) && process2(str, pattern, 0, 0, dp);

    }

/*
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
*/

    //str[si ..] 能被pattern[pi..]变出来
    //潜在：pi位置 pattern[pi] != *
    public static boolean process2(char[] str, char[] pattern, int si, int pi, int[][] dp) {
        if (dp[si][pi] != -1) { //说明已经计算过
            return dp[si][pi] == 1;
        }
        //si pi第一次计算



        if (si == str.length) {   //si越界了
            if (pi == pattern.length) {
                dp[si][pi] = 1;
                return true;
            }

            if (pi + 1 < pattern.length && pattern[pi + 1] == '*') {
                boolean ans = process2(str, pattern, si, pi + 2, dp);
                dp[si][pi] = ans ? 1 : 0;
                return ans;
            }
            dp[si][pi] = 0;
            return false;
        }

        //si没有越界  pi越界
        if (pi == pattern.length) {  //pattern ""  -> str 也要 ""
            boolean ans = si == str.length;
            dp[si][pi] = ans ? 1 : 0;
            return ans;
        }

        //si pi都没有越界
        if (pi + 1 >= pattern.length || pattern[pi + 1] != '*') {
            boolean ans = ((str[si] == pattern[pi] || pattern[pi] == '.') && process2(str, pattern, si+1, pi+1, dp));
            dp[si][pi] = ans ? 1 : 0;
            return ans;
        }


        //si没越界  pi没越界  pi+1 *
        //pi+1位置 -> '*'
        if (pattern[pi] != '.' && str[si] != pattern[pi]) {
            boolean ans = process2(str, pattern, si, pi + 2, dp);
            dp[si][pi] = ans ? 1 : 0;
            return ans;
        }
        //pi+1 * si pi
        //?* 0份
        if (process2(str, pattern, si, pi + 2, dp)) {
            dp[si][pi] = 1;
            return true;
        }

        while (si < str.length && (str[si] == pattern[pi] || pattern[pi] == '.')) {
            if (process2(str, pattern, si + 1, pi + 2, dp)) {
                dp[si][pi] = 1;
                return true;
            }
            si++;
        }
        dp[si][pi] = 0;
        return false;
    }

}
