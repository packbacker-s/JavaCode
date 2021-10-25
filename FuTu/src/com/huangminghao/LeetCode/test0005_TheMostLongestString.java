package com.huangminghao.LeetCode;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:20:56
 */
public class test0005_TheMostLongestString {
    /**
     * TODO:最长回文子串 Manacher算法
     * 给你一个字符串 s，找到 s 中最长的回文子串。
     * 示例 1：
     * 输入：s = "babad"
     * 输出："bab"
     * 解释："aba" 同样是符合题意的答案。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    //①暴力解：“31211214”
    // “#3#1#2#1#1#2#1#4#”借助字符来做辅助
    public int manacherMaxLen(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        // "12321" -> "#1#2#3#2#1#"
        char[] str = manacherString(s);
        // 回文半径大小
        int[] pArr = new int[str.length];
        int C = -1;
        int R = -1;//TODO:讲述中:R代表最右 扩成功的位置。 代码中：R代表 最右扩成功的位置的，再下一个位置
        int max = Integer.MIN_VALUE;//回文半径中（pArr）的最大值
        for (int i = 0; i < str.length; i++) {
            //TODO:i位置扩出来的答案，i位置扩的区域，至少是多大
            //i > R ->i在R外  R > i -> i在R内
            //i的对称点 -> 2*C - i
            // R - i 不用验证的区域
            pArr[i] = R > i ? Math.min(pArr[2 * C - i], R - i) : 1;

            while (i + pArr[i] < str.length && i - pArr[i] > -1) {
                if (str[i + pArr[i]] == str[i - pArr[i]]) {
                    pArr[i]++;
                } else {
                    break;
                }
            }

            if (i + pArr[i] > R) {
                R = i + pArr[i];
                C = i;
            }
            max = Math.max(max, pArr[i]);
        }
        return max - 1;
    }

    public char[] manacherString(String str) {
        char[] charArr = str.toCharArray();
        char[] res = new char[str.length() * 2 + 1];
        int index = 0;
        for (int i = 0; i != res.length; i++) {
            res[i] = (i & 1) == 0 ? '#' : charArr[index++];
        }
        return res;
    }




     /*TODO:public static int maxPLen(String str) {
        // "12321" -> "#1#2#3#2#1#"
        str -> strx
        int[] pArr = new int[strx.length];
        int R = -1;
        int C = -1;
        for (int i = 0; i < strx.length; i++) {
            if (i 在R外) {
                暴力扩
            } else {//i在R内
                if(i对称点的回文区域彻底在LR内部) {
                    pArr[i] = pArr[i对称点];
                } else if (i对称点的回文区域跑到LR外部) {
                    pArr[i] = i..R;
                } else  {//i对称点回文区域在左边界压线
                    从R往外扩张
                }
            }
        }
        return pArr最大值/2;
    }*/


    public String ManacherSolution(String str) {
        char[] chars = str.toCharArray();
        char[] charArr = new char[chars.length * 2 + 1];
        for (int i = 0, k = 0; i < charArr.length; i++) {
            charArr[i] = (i & 1) == 0 ? '#' : chars[k++];//字符串的转换好了 “12321” -》"#1#2#3#2#1#"
        }

        int pArr[] = new int[charArr.length];
        int C = -1;
        int R = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < charArr.length; i++) {
            int i_mirror = 2 * C - i;
            if (R > i) {//i在R内的情况
                pArr[i] = Math.min(R - i, pArr[i_mirror]);
            } else {
                pArr[i] = 1;
            }
            //中心扩展法
            while (i + pArr[i] < charArr.length && i - pArr[i] > -1) {
                if (charArr[i + pArr[i]] == charArr[i - pArr[i]]) {
                    pArr[i]++;
                } else {
                    break;
                }
            }

            if (i + pArr[i] > R) {
                R = i + pArr[i];
                C = i;
            }
            max = Math.max(max, pArr[i]);
        }
        //最长回文字串长度：TODO: max-1
        int len = max - 1;
        return str.substring((C - len + 1) / 2, (C - len + 1) / 2 + len) + "  长度：" + (max - 1);
        //return Arrays.toString(charArr);
    }


    public static void main(String[] args) {
        test0005_TheMostLongestString t = new test0005_TheMostLongestString();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            int res = t.manacherMaxLen(str);
            //int resStr = t.ManacherSolution(str);
            String resStr = t.ManacherSolution(str);
            System.out.println("manacherMaxLen： " + res);
            System.out.println("ManacherSolution：" + resStr);
        }

        String str1 = "abc123321";
        System.out.println("str1: " + t.shortestEnd(str1)); //=>> cba
    }


    //给定一个字符串， 在字符串后面添加字符 使之成为一个回文字符串
    // TODO:找到回文子串 包含 最后一个字符
    public String shortestEnd(String str) {
        char[] chars = str.toCharArray();
        char[] charArr = new char[chars.length * 2 + 1];
        for (int i = 0, k = 0; i < charArr.length; i++) {
            charArr[i] = (i & 1) == 0 ? '#' : chars[k++];//字符串的转换好了 “12321” -》"#1#2#3#2#1#"
        }

        int pArr[] = new int[charArr.length];
        int C = -1;
        int R = -1;
        int max = Integer.MIN_VALUE;
        int maxContainsEnd = -1;
        for (int i = 0; i < charArr.length; i++) {
            int i_mirror = 2 * C - i;
            if (R > i) {//i在R内的情况
                pArr[i] = Math.min(R - i, pArr[i_mirror]);
            } else {
                pArr[i] = 1;
            }
            //中心扩展法
            while (i + pArr[i] < charArr.length && i - pArr[i] > -1) {
                if (charArr[i + pArr[i]] == charArr[i - pArr[i]]) {
                    pArr[i]++;
                } else {
                    break;
                }
            }

            if (i + pArr[i] > R) {
                R = i + pArr[i];
                C = i;
            }
            if (R == charArr.length) {
                maxContainsEnd = pArr[i];
                break;
            }
        }
        char[] res = new char[str.length() - maxContainsEnd + 1];
        for (int i = 0; i < res.length; i++) {
            res[res.length - 1 - i] = charArr[i*2 + 1];
        }
        return String.valueOf(res);
    }
}