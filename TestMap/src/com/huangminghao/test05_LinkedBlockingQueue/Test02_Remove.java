package com.huangminghao.test05_LinkedBlockingQueue;

import java.net.ServerSocket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/04
 * @Time:15:19
 */
public class Test02_Remove {
    public static void main(String[] args) throws InterruptedException {
        //创建一个队列，队列可以指定容量指定长度3：
        LinkedBlockingQueue aq = new LinkedBlockingQueue();
        aq.add("aaa");
        aq.add("bbb");
        aq.add("ccc");
        //得到头元素但是不移除
        System.out.println(aq.peek());
        System.out.println(aq);
        //得到头元素并且移除
        System.out.println(aq.poll());
        System.out.println(aq);
        //得到头元素并且移除
        System.out.println(aq.take());
        System.out.println(aq);
        //清空元素：
        aq.clear();
        System.out.println(aq);
        System.out.println(aq.peek());//null
        System.out.println(aq.poll());//null
        //设置阻塞事件，如果队列为空，返回null，时间到了以后就不阻塞了
        //System.out.println(aq.poll(2, TimeUnit.SECONDS));
        //真正阻塞：队列为空，永远阻塞
        System.out.println(aq.take());

    }
}
