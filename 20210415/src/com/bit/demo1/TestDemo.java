package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *关键字super:
 *
 * super与this关键字的区别
 * this ：
 * this()调用本类其他的构造方法
 * this.data访问当前类对象属性
 * this.func()调用本类的其他成员方法
 * super：
 * super()调用父类的构造方法  必须放在第一行
 * super.data访问父类的属性
 * super.func()访问父类的成员方法
 *
 *final:
 * final int a = 10;  只能被初始化一次 之后就不能被继承
 * final 修饰类；  密封类 特性：不能被继承
 * final 修饰方法： 密封方法
 *
 * @User:Mingaho
 * @Date:2021/04/15
 * @Time:9:37
 */

class Animal {
    protected String name;

    public Animal(String name) {//构造方法
        this.name = name;
        System.out.println("Animal(String)");
    }

    public void eat() {
        System.out.println(this.name + "Animal::eat()");
    }
}

class Cat extends Animal{
    public Cat(String name) {   //子类在构造的时候，要先帮父类进行构造
        super(name);       //显示调用
        System.out.println("Cat(String)");
    }
}

class ChineseGardenCat extends Cat {
    public ChineseGardenCat(String name) {
        super(name);
    }
}

class Bird extends Animal {


    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Bird::fly()");
    }
}

public class TestDemo {

    public static void main(String[] args) {
        ChineseGardenCat chineseGardenCat = new ChineseGardenCat("miaomiao");
        chineseGardenCat.eat();

    }

    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        //cat.name = "mimi";
        cat.eat();
        //cat.sleep();可以继承不能被子类访问

        Bird bird = new Bird("八哥");
        bird.fly();
        bird.eat();
    }
}
