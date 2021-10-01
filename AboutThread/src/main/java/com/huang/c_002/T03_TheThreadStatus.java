package com.huang.c_002;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/10
 * @Time:18:09
 */
public class T03_TheThreadStatus {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getState());

        t.start();

        try {
            t.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getState());
    }
}
