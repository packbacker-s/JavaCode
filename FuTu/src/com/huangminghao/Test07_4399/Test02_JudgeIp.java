package com.huangminghao.Test07_4399;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/21
 * @Time:21:03
 */
public class Test02_JudgeIp {
    public static boolean isRightIp(String ip) {
        /*if (ip == null || ip.isEmpty()) {
            return false;
        }*/
        if (ip != null && !ip.isEmpty()) {
            String str = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9])\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";

            if (ip.matches(str)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean flag = isRightIp(str);
        System.out.println(flag);
    }
}
