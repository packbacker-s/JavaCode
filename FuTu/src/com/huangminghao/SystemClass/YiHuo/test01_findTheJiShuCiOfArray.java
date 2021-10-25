package com.huangminghao.SystemClass.YiHuo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/24
 * @Time:10:08
 */
public class test01_findTheJiShuCiOfArray {

    /**
     * 找到一个数组中出现了奇数次的数（只有一种数字）  其余出现了两次
     * @param arr
     * @return
     */
    public static int solution(int[] arr) {
        int ero = 0;
        for (int i = 0; i < arr.length; i++) {
            ero = ero ^ arr[i];
        }
        return ero;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        int res = solution(arr);
        System.out.println(res);
    }
}
