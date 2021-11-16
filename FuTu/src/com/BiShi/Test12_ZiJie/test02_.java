package com.BiShi.Test12_ZiJie;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:11:57
 */
public class test02_ {
    /**
     * 多古诺牌问题
     * @param str
     * @return
     */

    /*for (int i = 0; i < str.length(); i++) {//开始只往右边推
                if (str.charAt(i) != 'L' && str.charAt(i) == 'R') {
                    count++;
                    break;
                }
            }
            for (int i = str.length() - 1; i >= 0; i--) {//开始只往左边推
                if (str.charAt(i) != 'R' && str.charAt(i) == 'L') {
                    count++;
                    break;
                }
            }*/
    public static int solution(String str) {
        int count = 0;
        int index = -1;
        char[] ch = str.toCharArray();//多米诺骨牌 的数组情况
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'R') {
                if (index != -1) {
                    for (int j = index + 1; j < i; ++j) {
                        ch[j] = 'R';
                    }
                }
                index = i;
            } else if (str.charAt(i) == 'L') {
                if (index != -1) {
                    for (int j = i - 1; j >= 0; --j) {
                        if (ch[j] == '.') {
                            ch[j] = 'L';
                        } else {
                            break;
                        }
                    }
                } else {
                    int n = 1;
                    while (i - n > index + n) {
                        ch[i - n] = 'L';
                        ch[index + n] = 'R';
                        ++n;
                    }
                    index = -1;
                }
            }
        }
        if (index != -1) {
            for (int i = index + 1; i < ch.length; ++i) {
                ch[i] = 'R';
            }
        }
        StringBuilder str1 = new StringBuilder();
        for (char c : ch){
            str1.append(c);
        }

       /* for (int i = 0; i < str1.length(); i++) {
            if (char c : String.valueOf(str1)) {

            }

        }*/


        for (char c : ch) {
            if (c == '.') {
                count++;
            }
        }
        System.out.println(ch);
        return count;
    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int res = solution(str);
        System.out.println(res);
    }
}