package com.niuke.code;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * @User:Mingaho
 * @Date:2021/04/27
 * @Time:21:20
 */
public class Main8 {
    public int jumpFloor(int target) {
        if(target == 1) {
            return 1;
        } else if(target == 2) {
            return 2;
        } else {
            return jumpFloor(target - 1) + jumpFloor(target - 2);
        }
    }
}
