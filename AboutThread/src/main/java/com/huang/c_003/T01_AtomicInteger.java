package com.huang.c_003;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/11
 * @Time:9:22
 */
public class T01_AtomicInteger {
    AtomicInteger count = new AtomicInteger(0);

    /*synchronized */ void m(){
        for (int i = 0; i < 10000; i++) {
            count.incrementAndGet();//count++ 自增并得到这个值
        }//不加synchronized 线程也安全
    }
     public final Object o = new Object();

    public static void main(String[] args) {
        T01_AtomicInteger t = new T01_AtomicInteger();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m, "threadd-" + i));
        }


        threads.forEach((o) -> o.start());

        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
    }
}
