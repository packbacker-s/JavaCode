package com.BiShi.Test11_58;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/23
 * @Time:20:15
 */
public class test02_ShuZuFind {
    public static int query (int[] arr, int times) {
        // write code here
        /*int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }*/
        int index = -1;
        StringBuffer sb = new StringBuffer();
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                sb.append(arr[i]);
                sb.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(arr[arr.length - 1]);
        sb.append(count);

        StringBuffer sb1 = new StringBuffer();//存次数
        StringBuffer sb2 = new StringBuffer();//存数字
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                if ((sb.charAt(i) - '0') == times) {
                    sb1.append(sb.charAt(i - 1));
                }
            } else {
                sb2.append(sb.charAt(i));
            }
        }
        char[] arr1 = String.valueOf(sb2).toCharArray();
        int[] arr2 = new int[sb2.length()];
        for (int i = 0, k = 0; i < sb2.length(); i++) {
            arr2[k++] = arr1[i] - '0';
        }


        //Arrays.sort(arr2);
        int max = arr2[arr2.length - 1];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                index = i;
                break;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4, 4, 6, 6, 7};
        int n = 2;
        int ret = query(arr, n);
        System.out.println(ret);
    }
}
