package com.bit.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 *
 * @User:Mingaho
 * @Date:2021/04/15
 * @Time:15:06
 */
class Animal {
    protected String name;
    public Animal(String name) {//构造方法
        this.name = name;
        //System.out.println("Animal(String)");
        eat();
    }
    public void eat() {
        System.out.println(this.name + " Animal::eat()");
    }
}

class Cat extends Animal {
    public int count = 99;
    public Cat(String name) {   //子类在构造的时候，要先帮父类进行构造
        super(name);       //显示调用
        System.out.println("Cat(String)");
    }
    /*public void eat() {
        System.out.println(this.name + " 的示范方法Cat::eat()");
    }*/
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println("Bird::fly()");
    }
}
public class TestMain {

    public static void main(String[] args) {
        Cat cat = new Cat("八哥");
        //cat.eat();

    }


    /**
     * 向下转型的不安全演示
     */
    public static void main7(String[] args) {
        Animal animal = new Cat("八哥");

        if(animal instanceof Bird) {
            Bird bird = (Bird)animal;
            bird.fly();
        }else {
            System.out.println("asdfs");
        }

    }

    /**
     * 向下转型
     * 注意：向下转型 不安全
     */

    public static void main6(String[] args) {
        Animal animal = new Bird("八哥");
        animal.eat();

        //向下转型  -》 父类的引用 赋值给了子类
        Bird bird = (Bird)animal;
        bird.fly();
    }


    /**
     *
     * 重载： 方法名相同， 参数个数不同  返回值不做要求  同一个类中
     *
     *
     * 多态:
     * 运行时绑定/动态绑定：
     * 父类引用 引用子类对象 同时 通过父类引用调用同名的覆盖方法
     * 此时就会发生运行时绑定
     *
     *
     * 重写/复写：   注意：1、不能被final 修饰
     *                  2、访问修饰限定符不能是私有的
     *                  3、子类当中的访问修饰限定符 大于 父类的访问修饰限定符
     *                  4、被static修饰的方法不能被重写
     *      方法名相同
     *      参数列表相同
     *      返回值相同
     *      不同的类->继承关系上
     * @return
     */
    public static void main5(String[] args) {
        Animal animal = new Cat("咪咪");
        animal.eat();
    }










    public static Animal func() {
        /*Cat cat = new Cat("咪咪");
        return cat;*/
        return new Cat("咪咪");
    }
    public static void main4(String[] args) {     //返回值
        Animal animal = func();
        animal.eat();
    }


    public static void func(Animal animal) {
        animal.eat();
    }
    public static void main3(String[] args) {   //传参
        Cat cat = new Cat("咪咪");
        func(cat);
    }

    //向上转型  父类引用 引用子类对象
    public static void main2(String[] args) {    //直接复制
        Animal animal = new Cat("咪咪");
        animal.eat();
        //animal.count; 向上转型之后，通过父类的引用 只能访问父类自己的方法或者属性  //父类不能访问子类属性 可以访问子类对象
    }


    public static void main1(String[] args) {
        Animal animal = new Animal("豆豆");
        Cat cat = new Cat("咪咪");

    }
}
