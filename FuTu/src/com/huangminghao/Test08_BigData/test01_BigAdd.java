package com.huangminghao.Test08_BigData;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/22
 * @Time:15:41
 */
public class test01_BigAdd {
    public static String bigAdd(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        while (len1 < len2) {
            str1 = "0" + str1;
        }
        while (len1 > len2) {
            str2 = "0" + str2;
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < len1; i++) {
            int add = (str1.charAt(len1 - 1 - i) - '0') + (str2.charAt(len1 - 1 - i) - '0') + carry;
            sb.append(add % 10);
            carry = add / 10;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "123454321";
        String str2 = "987656789";
        String ret = bigAdd(str1, str2);
        System.out.println(ret.toString());
    }
}
