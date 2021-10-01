package com.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/27
 * @Time:11:09
 */
public class 数值的整数次方 {
    public double power(double base, int exponent) {
        double ret = 1.0;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                ret *= base;
            }
        } else if (exponent < 0) {
            if (base == 0) {
                return -1;
            }
            for(int i = 0; i < -exponent; i++) {
                ret *= 1.0/base;
            }
        } else {
            return 1;
        }
        return ret;
    }
}
