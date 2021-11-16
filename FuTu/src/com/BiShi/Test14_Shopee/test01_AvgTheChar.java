package com.BiShi.Test14_Shopee;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/25
 * @Time:15:38
 */
public class test01_AvgTheChar {
    public static boolean deleteOneChar(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        String s = str.substring(1,str.length());
        char[] charArr = s.toCharArray();
        char[] chars = new char[256];//统计次数
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            chars[charArr[i]]++;
        }

        int k = 0;
        char[] arr = new char[chars.length];
        for (int i = 0; i < charArr.length; i++) {//出现的次数依次放入arr
            arr[k++] = chars[charArr[i]];
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        if (count <= 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            char[] c = str.toCharArray();
            System.out.println(str.substring(1, str.length() - 1));
            boolean flag = deleteOneChar(str);
            System.out.println(flag);

        }
    }
}
