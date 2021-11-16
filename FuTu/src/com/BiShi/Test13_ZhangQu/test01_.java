package com.BiShi.Test13_ZhangQu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:14:49
 */
public class test01_ {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        dfs(n, k, 1, res, temp);
        return res;
    }

    public void dfs(int n, int k, int next, List<List<Integer>> res, List<Integer> temp) {
        if (temp.size() == k) {
            res.add(new ArrayList(temp));
            return;
        } else {
            for (int i = 0; i < next; i++) {
                temp.add(i);
                dfs(n, k, i + 1, res, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

}
