package com.niuke.code;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * 1）这里的f(n) 代表的是n个台阶有一次1,2,...n阶的 跳法数。
 * 2）n = 1时，只有1种跳法，f(1) = 1
 * 3) n = 2时，会有两个跳得方式，一次1阶或者2阶，这回归到了问题（1） ，f(2) = f(2-1) + f(2-2)
 * 4) n = 3时，会有三种跳得方式，1阶、2阶、3阶，
 *  f(n-1) = f(0) + f(1)+f(2)+f(3) + ... + f((n-1)-1) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2)
 *     f(n) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2) + f(n-1) = f(n-1) + f(n-1)
 *     可以得出：
 *     f(n) = 2*f(n-1)
 * @User:Mingaho
 * @Date:2021/04/27
 * @Time:21:19
 */
public class Main9 {
    public int jumpFloorII(int target) {
        if(target <= 0) {
            return 0;
        }
        if(target == 1) {
            return 1;
        }
//         if(target == 2) {
//             return 2;
//         }
        return 2 * jumpFloorII(target - 1);
    }
}
