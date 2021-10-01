package com.huang.c_006;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/17
 * @Time:17:52
 */
public class T02_sync_wait_notify {
    public static void main(String[] args) {

        final Object o = new Object();
        char[] aI = "1234567".toCharArray();
        char[] aC = "ABCDEFG".toCharArray();

        new Thread(() -> {
            synchronized (o) {
                for (char c : aI) {
                    System.out.print(c);
                    try {
                        o.notify();//叫醒其他线程
                        o.wait();//该线程阻塞
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();//必须调用，否则无法停止程序
            }
        }, "t1").start();

        new Thread(() -> {
            synchronized (o) {
                for (char c : aC) {
                    System.out.print(c);
                    try {
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }, "t2").start();
    }
}
