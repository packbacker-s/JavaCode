package com.huangminghao.test04_ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/04
 * @Time:14:37
 */
public class Test01_Add {
    public static void main(String[] args) throws InterruptedException {
        //创建一个队列，队列可以指定容量指定长度3：
        ArrayBlockingQueue aq = new ArrayBlockingQueue(3);
        //添加元素：
        //【1】添加null元素：不可以添加null元素，会报空指针异常：NullPointerException
        //aq.add(null);
        //aq.offer(null);
        //aq.put(null);
        //【2】正常添加元素：
        aq.add("aaa");
        aq.offer("bbb");
        aq.put("ccc");
        System.out.println(aq);//[aaa, bbb, ccc]
        //【3】在队列满的情况下，再添加元素：
        //aq.add("ddd");//在队列满的情况下，添加元素 出现异常：Queue full
        //System.out.println(aq.offer("ddd"));//没有添加成功，返回false
        //设置最大阻塞时间，如果时间到了，队列还是满的，就不再阻塞了
        //aq.offer("ddd",2, TimeUnit.SECONDS);
        //真正阻塞的方法： put ,如果队列满，就永远阻塞
        aq.put("ddd");
        System.out.println(aq);
    }
}
