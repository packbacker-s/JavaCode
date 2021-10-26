package com.huangminghao.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *TODO:括号的生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 有效括号组合需满足：左括号必须以正确的顺序闭合。
 * 示例 1：
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * 输入：n = 1
 * 输出：["()"]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @User:Mingaho
 * @Date:2021/10/26
 * @Time:19:56
 */
public class test0022_GenerateParentheses {
    //TODO:生成括号合法数量
    public static List<String> generateParentheses(int n) {
        // ()
        char[] path = new char[n << 1];
        List<String> ans = new ArrayList<>();
        process(path, 0, 0, n, ans);
        return ans;
    }

    //依次在path上填写决定
    //( ( ) ) ( )
    //0 1 2 3 4 5
    //path[0...index-1]决定做完了
    //index位置上，()
                                //TODO:(括号数 减去 )括号数的结果，左括号剩余
    public static void process(char[] path, int index, int leftMinusRight, int leftRest, List<String> ans) {
        if (index == path.length) {                                       //TODO:（括号数剩余，n-（
            ans.add(String.valueOf(path));
        } else {
            if (leftRest > 0) {   //表示左括号( 还有剩余 还能用
                path[index] = '('; //使用左括号
                process(path, index + 1,leftMinusRight + 1, leftRest - 1, ans);//轮到下一个index+1位置做决定
            }
            if (leftMinusRight > 0) {
                path[index] = ')';
                process(path, index + 1, leftMinusRight - 1, leftRest, ans);
            }
        }
    }
}
