package com.huang.Thread100000000;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/21
 * @Time:14:30
 */
public class Test01_Thread1_0000_00000 {
    private static double[] nums = new double[1_0000_0000];
    private static Random r = new Random();
    private static DecimalFormat df = new DecimalFormat("0.00");
    static {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextDouble();
        }
    }

    private static void m1() {
        long start = System.currentTimeMillis();
        double ret = 0.0;
        for (int i = 0; i < nums.length; i++) {
            ret += nums[i];
        }
        long end = System.currentTimeMillis();
        System.out.println("m1: " + (end - start) + " result = " + df.format(ret));
    }

    static double ret1 = 0.0, ret2 = 0.0, ret = 0.0;
    private static void m2() throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < nums.length / 2; i++) {
                ret1 += nums[i];
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = nums.length / 2; i < nums.length; i++) {
                ret2 += nums[i];
            }
        });
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        ret = ret1 + ret2;
        long end = System.currentTimeMillis();
        System.out.println("m2: " + (end - start) + " result = " + df.format(ret));
    }

    private static void m3() throws Exception {
        final int threadCount = 16;
        Thread[] threads = new Thread[threadCount];
        double[] results = new double[threadCount];
        final int segmentCount = nums.length / threadCount;
        CountDownLatch latch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            int m = i;

            threads[i] = new Thread(() -> {
                for (int j = m * segmentCount; j < (m + 1) * segmentCount && j < nums.length; j++) {
                    results[m] += nums[j];
                }
            });

            latch.countDown();
        }

        double resultM3 = 0.0;
        long start = System.currentTimeMillis();
        for (Thread t : threads) {
            t.start();
        }

        latch.await();
        for (int i = 0; i < results.length; i++) {
            resultM3 += results[i];
        }
        long end = System.currentTimeMillis();
        System.out.println("m3: " + (end - start) + " result = " + df.format(ret));
    }


    public static void main(String[] args) throws Exception {
        m1();
        m2();
        m3();
    }
}
