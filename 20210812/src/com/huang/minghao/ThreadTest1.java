package com.huang.minghao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 多线程的创建：
 * 方式一：继承于Thread类
 * 1、创建一个继承于Thread类的子类
 * 2、重写Thread类中的run方法  -->将此线程执行的操作生命在run()中
 * 3、创建Thread类的子类的对象
 * 4、通过此对象调用start()
 *
 * 例子：遍历100以内的偶数
 *
 * @User:Mingaho
 * @Date:2021/08/12
 * @Time:16:58
 */
//1、创建一个继承于Thread类的子类
class MyThread extends Thread{
//2、重写Thread类中的run方法

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        //3、创建Thread类的子类的对象
        MyThread t1 = new MyThread();

        //4、通过此对象调用start() ①启动当前线程②调用线程run方法
        t1.start();
        //问题一：我们不能直接通过调用run方法启动线程
        //t1.run();
        //问题二：再启动一个线程，进行100以内的偶数，不可以让已经start()的线程去执行会报illegalThreadStateException
        //t1.start();
        //我们需要重新创建一个线程对象
        MyThread t2 = new MyThread();
        t2.start();


        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "******main******");
            }
        }
    }
}
