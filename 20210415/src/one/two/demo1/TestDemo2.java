package one.two.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 理解多态
 *
 * @User:Mingaho
 * @Date:2021/04/15
 * @Time:20:51
 */
class Shape {
    public void draw() {

    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
public class TestDemo2 {

    /**
     * 什么是多态
     * 多态发生的前提主要有两个：
     * 1、父类引用  引用子类对象
     * 2、父类和子类有同名的覆盖方法
     * 3、通过父类引用  去调用这个重写的方法
     * @param shape
     */

    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        drawMap(shape1);
        drawMap(shape2);

    }
}
