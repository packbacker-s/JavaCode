package com.huangminghao.xuliejieou;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/23
 * @Time:20:37
 */
public class T_No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] B = new int [n];
        int[] A = new int [n];

        int i;
        for (i = 0; i < n; i++) {
            B[i] = scan.nextInt();
        }
        
        int jiSum = 0, ouSum = 0;
        for(int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                jiSum += B[j];
            }else {
                ouSum += B[j];
            }
        }

        int len = n;
        while (n > 0) {
            for (int k = 0; k < len; k++) {

                if (k + 1 >= B[k]) {
                    A[k] = jiSum - ouSum;
                }

                n--;
            }
        }

        for (int j = 0; j < len; j++) {
            System.out.print(A[j] + " ");
        }
    }
}
