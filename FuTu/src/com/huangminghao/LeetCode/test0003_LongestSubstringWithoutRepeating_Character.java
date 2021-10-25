package com.huangminghao.LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:17:14
 */
public class test0003_LongestSubstringWithoutRepeating_Character {
    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     * 示例 1:
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
      */
    public int longestSubstringWithoutRepeating_Character(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        char[] ch = str.toCharArray();
        //map (a, ?)  (b, ?)
        //     a, 17
        //map[97] = 17
        int[] map = new int[256];//字符最大到255
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        int len = 0;//收集答案
        int pre = -1;//i-1位置结尾情况下  往左推，推不动的位置是谁
        int cur = 0;
        for (int i = 0; i != ch.length; i++) {
            //i位置结尾情况下  往左推，推不动的位置是谁
            pre = Math.max(pre, map[ch[i]]);//pre(i-1信息)  更新-》 pre(i结尾信息)


            cur = i - pre;//当前最长推动位置
            len = Math.max(len, cur);//找到最大的推动的值
            map[ch[i]] = i;//更新map位置
        }
        return len;

    }

    public int longestSubstringWithoutRepeating_Character_1(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] ch = str.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        int len = 0;
        int pre = -1;
        int cur = 0;
        for (int i = 0; i < ch.length; i++) {
            pre = Math.max(pre, map[ch[i]]);
            cur = i - pre;
            len = Math.max(len, cur);
            map[ch[i]] = i;
        }
        return len;
    }

}
