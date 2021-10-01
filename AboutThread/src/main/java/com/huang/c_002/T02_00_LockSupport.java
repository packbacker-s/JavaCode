package com.huang.c_002;

import java.util.concurrent.locks.LockSupport;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/10
 * @Time:14:34
 */
public class T02_00_LockSupport {
    static Thread t1 = null, t2 = null;

    public static void main(String[] args) throws Exception {
        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        t1 = new Thread(() -> {

            for (char c : aI) {
                System.out.print(c);
                LockSupport.unpark(t2);//叫醒t2
                LockSupport.park();//t1阻塞，当前线程阻塞
            }

        }, "t1");

        t2 = new Thread(() -> {

            for (char c : aC) {
                LockSupport.park();//t2阻塞
                System.out.print(c);
                LockSupport.unpark(t1);//叫醒t1
            }

        }, "t2");

        t1.start();
        t2.start();
    }
}
