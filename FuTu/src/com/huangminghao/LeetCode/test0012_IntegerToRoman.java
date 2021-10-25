package com.huangminghao.LeetCode;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/25
 * @Time:19:25
 */
public class test0012_IntegerToRoman {
    /**
     * TODO:字符   I  V   X   L    C     D     M
     *      数值   1  5  10   50   100   500   1000
     *      罗马数字没有 0
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/integer-to-roman
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param num
     * @return
     */
    public String IntToRoman(int num) {
        String[][] c = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM", }
        };
        StringBuilder roman = new StringBuilder();
        roman
                .append(c[3][num / 1000 % 10])
                .append(c[2][num / 100 % 10])
                .append(c[1][num / 10 % 10])
                .append(c[0][num % 10]);
        return roman.toString();
    }

    public static void main(String[] args) {
        test0012_IntegerToRoman t = new test0012_IntegerToRoman();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            System.out.println(t.IntToRoman(scan.nextInt()));
        }
    }

}
