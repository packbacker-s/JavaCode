package com.niuke.code;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 *
 * 1   1种
 * 2   2种
 * 3   3种
 * 4   5种
 * 5   8种
 * ...
 * @User:Mingaho
 * @Date:2021/04/28
 * @Time:9:11
 */
public class Main10 {
    public int rectCover(int target) {
        if(target <= 0) {
            return 0;
        }
        if(target == 1) {
            return 1;
        }
        if(target == 2) {
            return 2;
        }
        return rectCover(target - 1) + rectCover(target - 2);
    }
}
