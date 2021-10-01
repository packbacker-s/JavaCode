package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/15
 * @Time:11:01
 */
class Test {
    int a; //默认权限 -》包访问权限 -》只能在同一包中访问

}
public class TestDemo3 {
    public static void main(String[] args) {
        int b;
        Test test = new Test();
        System.out.println(test.a);
    }
}
