package com.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/08/27
 * @Time:14:21
 */
public class 奇数放偶数前面 {
    public void ReOrderArray(int [] array) {
        int len = array.length;
        int jl = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 != 0) {
                jl++;
            }
        }
        int ol = len - jl;
        int [] jishu = new int [jl];
        int [] oushu = new int [ol];
        int ji = 0;
        int ou = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 != 0) {
                jishu[ji++] = array[i];
            }else {
                oushu[ou++] = array[i];
            }
        }
        for (int i = 0; i < jl; i++) {
            array[i] = jishu[i];
        }
        for (int j = 0; j < ol; j++) {
            array[ji++] = oushu[j];
        }
    }
}
