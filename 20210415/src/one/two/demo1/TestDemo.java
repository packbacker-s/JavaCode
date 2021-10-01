package one.two.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/15
 * @Time:20:34
 */
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + "正在吃.Animal");
    }
}
class Cat extends Animal {
    public String huzi;
    public Cat(String name, String huzi) {
        super(name);
        this.huzi = huzi;
    }
    public void func() {
        System.out.println(this.name);;
    }
    public void eat() {
        System.out.println(this.name + "正在吃.Cat");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //父类引用 引用子类对象    向上转型
        Animal animal = new Cat("初一", "胡子");
        animal.eat();
        //
        /*Cat cat = new Cat("咪咪", "有大胡子");
        cat.eat();*/
    }
}
