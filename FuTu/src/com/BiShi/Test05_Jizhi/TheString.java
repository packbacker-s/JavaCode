package com.BiShi.Test05_Jizhi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/16
 * @Time:9:49
 */
public class TheString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        String str = scan.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] >= '0' && arr[i] <= '9') {
               // for (int j = 0; j < Integer.parseInt('arr[i]')); i++) {

               // }
            }
        }
    }
}
