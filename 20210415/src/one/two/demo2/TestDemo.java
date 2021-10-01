package one.two.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 *抽象类
 * 1、如果一个方法被abstract修饰，那么这个方法就是抽象方法。抽象方法可以没有具体实现
 * 2、包含抽象方法的类，抽象类
 * 注意点：
 * 1、抽象类不能被实例化  不能被new    Shape shape = new Shape();
 * 2、类内的数据成员和普通类没有区别
 * 3、抽象类主要就是用来被继承的
 * 4、一个类如果继承了这个抽象类
 * 5、当抽象类A 继承 抽象类B 那么A可以不重写B中的方法，但是一旦A要是再被继承，
 * 那么一定还要重写这抽象个方法
 * @User:Mingaho
 * @Date:2021/04/16
 * @Time:10:08
 */
abstract class Shape {
    /*public int age;
    private int a;
    public void func() {

    }*/
    public abstract void draw();
}
class Cycle extends Shape {   //abstract class Cycle extends Shape    然后不写draw方法
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}

abstract class A extends Cycle {
    /*public void draw() { }*/
}

class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画一朵花");
    }
}
public class TestDemo {

    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        //Shape shape = new Shape();抽象类不能被实例化  不能被new
        Shape shape1 = new Cycle();
        Shape shape2 = new React();

    }
}
