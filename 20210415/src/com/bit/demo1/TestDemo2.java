package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/15
 * @Time:9:55
 */
class Base {
    public int a;
}
class Derive extends Base {
    public int b;
}
public class TestDemo2 {

    public static void main(String[] args) {

    }
    public static void main2(String[] args) {
        Test test = new Test();
        System.out.println(test.a);
    }


    public static void main1(String[] args) {
        Derive derive = new Derive();
        derive.a = 99;
        System.out.println(derive.a);
    }
}
