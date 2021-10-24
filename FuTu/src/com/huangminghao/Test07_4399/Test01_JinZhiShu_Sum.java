package com.huangminghao.Test07_4399;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/21
 * @Time:21:01
 */
public class Test01_JinZhiShu_Sum {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        String str1 = String.valueOf(x);
        String str2 = String.valueOf(y);
        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        StringBuilder sb = new StringBuilder();
        int lenLong = str1.length();
        int lenShort = str2.length();

        int jinshu = 0;

        for (int i = 0; i < lenShort; i++) {
            int add = (str1.charAt(lenLong - 1 - i) - '0') + (str2.charAt(lenShort - 1 - i) - '0') + jinshu;
            sb.append(add % n);
            jinshu = add / n;
        }

        for (int i = lenShort; i < lenLong; i++) {
            int add = (str1.charAt(lenLong - 1 - i) - '0') + jinshu;
            sb.append(add % n);
            jinshu = add / n;
        }

        if (jinshu != 0) {
            sb.append(jinshu);
        }

        String ret = sb.reverse().toString();
        System.out.println(ret);

    }

}
