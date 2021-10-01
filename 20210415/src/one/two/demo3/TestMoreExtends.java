package one.two.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/16
 * @Time:16:00
 */
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

//一个类可以继承一个普通类/抽象类，并且可以实现多个接口
//extends   implements
class Cat extends Animal implements IRunning {
    public Cat(String name) {  //
        super(name);
    }
    @Override                //重写
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}
class Frog extends Animal implements IRunning,ISwimming {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "它正在跑");
    }

    @Override
    public void swim() {
        System.out.println("它正在游");
    }
}


class Robot implements IRunning {
    @Override
    public void run() {
        System.out.println("我是机器人 我在用腿跑");
    }
}

public class TestMoreExtends {
    public static void walk(IRunning running) {
        System.out.println("我带伙伴去散步");
        running.run();
    }

    public static void walk(ISwimming swimming) {
        System.out.println("我带伙伴去游泳");
        swimming.swim();
    }

    public static void main(String[] args) {
        IRunning iRunning = new Robot();
        //iRunning.run();
        walk(iRunning);
        IRunning iRunning1 = new Frog("轻轻");
        walk(iRunning1);
        ISwimming iSwimming = new Frog("轻轻");
        walk(iSwimming);
    }
}
