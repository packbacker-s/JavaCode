package com.BiShi.TongYuanRuanKong;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/30
 * @Time:19:55
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}

public class test01_JudgeTree_is_TheSame {
    public static boolean judgeTree_is_TheSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            } else {
                return judgeTree_is_TheSame(p.left, q.left) && judgeTree_is_TheSame(p.right, q.right);
            }
        }

        return false;
    }
}
