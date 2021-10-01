package com.huang.minghao;

import sun.plugin2.os.windows.Windows;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 创建三个窗口卖票 总票数为100张，使用继承Thread类的方式
 *
 * 存在线程安全问题（票号重复），待解决
 * @User:Mingaho
 * @Date:2021/08/24
 * @Time:16:55
 */
class windows extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ": 卖票，票号为：" + ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
public class WindowsTest1 {
    public static void main(String[] args) {
       windows w1 = new windows();
       windows w2 = new windows();
       windows w3 = new windows();

       w1.setName("窗口1");
       w2.setName("窗口2");
       w3.setName("窗口3");

       w1.start();
       w2.start();
       w3.start();

    }
}
