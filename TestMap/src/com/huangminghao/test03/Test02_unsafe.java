package com.huangminghao.test03;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/04
 * @Time:11:17
 */
public class Test02_unsafe {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        //创建一个线程池
        ExecutorService es = Executors.newFixedThreadPool(100);

        //并发向集合添加1 0000数据
        for (int i = 0; i < 10000; i++) {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    list.add("aaa");
                }
            });
        }
        //关闭线程池资源
        es.shutdown();

        //监控线程是否执行完毕
        while (true) {
            if (es.isTerminated()) {
                System.out.println("所有线程执行完了");
                System.out.println(list.size());
                if (list.size() == 10000) {
                    System.out.println("线程安全");
                } else {
                    System.out.println("线程不安全");
                }
                break;
            }
        }
    }
}
