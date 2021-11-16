package com.BiShi.TongYuanRuanKong;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/30
 * @Time:19:53
 */
public class test02_SwapWithoutOtherTemp {
    public static int[] swapWithoutOtherTemp(int[] AB) {
        if (AB == null) {
            return null;
        }
        if (AB.length == 1) {
            return AB;
        } else {
            AB[0] = AB[0] ^ AB[1];
            AB[1] = AB[0] ^ AB[1];
            AB[0] = AB[0] ^ AB[1];
        }
        return AB;
    }
}
