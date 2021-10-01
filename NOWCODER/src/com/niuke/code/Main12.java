package com.niuke.code;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0。不得使用库函数，同时不需要考虑大数问题，也不用考虑小数点后面0的位数。
 *
 * 示例1
 * 输入
 * 2.00000,3
 * 返回值
 * 8.00000
 * 示例2
 * 输入
 * 2.10000,3
 * 返回值
 * 9.26100
 * 示例3
 * 输入
 * 2.00000,-2
 * 返回值
 * 0.25000
 * 说明
 * 2的-2次方等于1/4=0.25
 * @User:Mingaho
 * @Date:2021/04/29
 * @Time:15:04
 */
public class Main12 {
    public double Power(double base, int exponent) {
        double ret = 1.0;
        if(exponent > 0) {
            for(int i = 0; i < exponent; i++) {
                ret *= base;
            }
        }else if(exponent < 0) {
            if(base == 0) {
                return -1;
            }
            for(int i = 0; i < -exponent; i++) {
                ret *= 1.0/base;
            }
        }else {
            return 1;
        }
        return ret;
    }
}
