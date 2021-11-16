package com.BiShi.TongYuanRuanKong;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/30
 * @Time:20:20
 */
public class test03_TheWayOfMap {
    public static int theWayOfMap(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = res * (n + m - 1 - i) / i;
        }
        return res;
    }
}
