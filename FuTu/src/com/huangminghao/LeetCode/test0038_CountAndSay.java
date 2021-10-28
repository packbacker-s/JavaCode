package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/27
 * @Time:20:14
 */
public class test0038_CountAndSay {
    /**TODO:
     *  "1"         1个1
     *  “11”        2个1
     *  “21”        1个2，1个1
     *  “1211”      1个1，1个2，2个1
     *  -> "111221"
     *
     * @return
     */
    public static String countAndSay(int n) {
        if (n < 1) {
            return "";
        }
        if (n == 1) {
            return "1";
        }
        char[] last = countAndSay(n - 1).toCharArray();
        StringBuilder ans = new StringBuilder();
        int times = 1;
        for (int i = 1; i < last.length; i++) {
            if (last[i - 1] == last[i]) {
                times++;
            } else {
                ans.append(String.valueOf(times));
                ans.append(String.valueOf(last[i - 1]));
                times = 1;
            }
        }
        ans.append(String.valueOf(times));
        ans.append(String.valueOf(last[last.length - 1]));
        return ans.toString();
    }

    public static void main(String[] args) {
        String str1 = countAndSay(5);
        String str2 = countAndSay(60);
        System.out.println(str1);
        System.out.println(str2 + " " + str2.length());
    }
}
