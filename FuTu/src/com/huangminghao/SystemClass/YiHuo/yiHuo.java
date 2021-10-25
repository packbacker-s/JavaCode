package com.huangminghao.SystemClass.YiHuo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:9:51
 */
public class yiHuo {
    /**
     * 异或运算 ：相同为0 不同为 1  ==>>无进位相加
     * 同或运算 ：相同为1 不同为 0
     */



    public static void main(String[] args) {
        int a = 14;
        int b = 14;
        System.out.println(a + " " + b);
        //地址位置不能一样   i = j  =>  a[i] = a[i] ^ a[j] , a[j] = a[i] ^ a[j] , a[i] = a[i] ^ a[j]  =>>0
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }

}
