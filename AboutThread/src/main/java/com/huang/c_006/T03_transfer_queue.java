package com.huang.c_006;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/17
 * @Time:19:40
 */
public class T03_transfer_queue {
    public static void main(String[] args) {
        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        TransferQueue<Character> queue = new LinkedTransferQueue<>();

        new Thread(() -> {
            try {
                for (char c : aI) {
                    System.out.print(queue.take());
                    queue.transfer(c);
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t1").start();


        new Thread(() -> {
            try {
                for (char c : aC) {
                    queue.transfer(c);
                    System.out.print(queue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2").start();
    }
}
