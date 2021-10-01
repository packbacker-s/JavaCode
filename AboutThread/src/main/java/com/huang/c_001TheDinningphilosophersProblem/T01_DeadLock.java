/*
package com.huang.c_1TheDinningphilosophersProblem;

*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/10
 * @Time:12:08
 *//*

public class T01_DeadLock {
    public static void main(String[] args) {
        ChopStick cs0 = new ChopStick();
        ChopStick cs1 = new ChopStick();
        ChopStick cs2 = new ChopStick();
        ChopStick cs3 = new ChopStick();
        ChopStick cs4 = new ChopStick();

        Philosohper p0 = new Philosohper("p0", 0, cs0, cs1);
        Philosohper p1 = new Philosohper("p0", 0, cs1, cs2);
        Philosohper p2 = new Philosohper("p0", 0, cs2, cs3);
        Philosohper p3 = new Philosohper("p0", 0, cs3, cs4);
        Philosohper p4 = new Philosohper("p0", 0, cs4, cs0);

        p0.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }

    public static class Philosohper extends Thread {
        private ChopStick left, right;
        private int index;

        public Philosohper(String name, int index, ChopStick left, ChopStick right) {
            this.setName(name);
            this.index = index;
            this.left = left;
            this.right = right;
        }

        @Override
        public void run() {
            if (index == 0) { //index % 2 == 0
                synchronized (left) {
                    SleepHelper.sleepSeconds(1);
                    synchronized (right) {
                        SleepHelper.sleepSeconds(1);
                        System.out.println(index + "吃完了");
                    }
                }
            } else {
                synchronized (right) {
                    SleepHelper.sleepSeconds(1);
                    synchronized (left) {
                        SleepHelper.sleepSeconds(1);
                        System.out.println(index + "吃完了");
                    }
                }
            }
        }
    }
}
*/
