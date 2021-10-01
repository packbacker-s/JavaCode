package com.niuke.code;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 思路：
 *
 * 采用阵地攻守的思想：
 * 第一个数字作为第一个士兵，守阵地；count = 1；
 * 遇到相同元素，count++;
 * 遇到不相同元素，即为敌人，同归于尽,count--；当遇到count为0的情况，又以新的i值作为守阵地的士兵，
 * 继续下去，到最后还留在阵地上的士兵，有可能是主元素。
 * 再加一次循环，记录这个士兵的个数看是否大于数组一般即可。
 * @User:Mingaho
 * @Date:2021/04/29
 * @Time:20:28
 */
public class Main28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        if(len <= 0) {
            return -1;
        }
        int result = array[0];
        int times = 0;
        for(int i = 1; i < len; i++) {
            if(times == 0) {
                result = array[i];
                times = 1;
            }else {
                if(result == array[i]) {
                    times++;
                }else {
                    times--;
                }
            }
        }
        times = 0;
        for(int i = 0; i < len; i++) {
            if(result == array[i]) {
                times++;
            }
        }
        if(times * 2 > len) {
            return result;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 0, 4, 0, 0, 4, 0, 0, 0};
        Main28 main28 = new Main28();
        int ret = main28.MoreThanHalfNum_Solution(array);
        System.out.println(ret);
    }
}
