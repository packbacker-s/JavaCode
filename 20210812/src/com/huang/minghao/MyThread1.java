package com.huang.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/07
 * @Time:23:11
 */
public class MyThread1 extends Thread{
    public static void main(String[] args) {
        while(true) {
            MyThread1 t=new MyThread1();
            MyThread1 s=new MyThread1();
            t.start();
            System.out.println("one.");
            s.start();
            System.out.println("two.");
        }
    }
    public void run() {
        System.out.println("Thread");
    }
}
