package com.huangminghao.LeetCode;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * TODO:字符   I  V   X   L    C     D     M
 *      数值   1  5  10   50   100   500   1000
 *      罗马数字没有 0
 * @User:Mingaho
 * @Date:2021/10/25
 * @Time:19:45
 */
public class test0013_RomanToInteger {
    public int romanToInteger(String str) {
        int nums[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum -= nums[i];
            } else {
                sum += nums[i];
            }
        }
        return sum + nums[nums.length - 1];
    }

    public static void main(String[] args) {
        test0013_RomanToInteger t = new test0013_RomanToInteger();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            int res = t.romanToInteger(str);
            System.out.println(res);
        }
    }
}
