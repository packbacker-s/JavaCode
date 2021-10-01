/*
import java.util.Arrays;

*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 *
 * public interface Cloneable {
 * }
 * 面试题：为什么这个接口是空接口？
 * 空接口也叫做标记接口 它是这个意思：
 *一个类实现了这个接口，那么就标记这个类是可以进行clone的
 *
 * 重写clone的方法 --》Object
 *
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:11:01
 *//*



*/
/**
 * 1、继承 封装 多态 组合
 * 封装：private修饰  字段 方法 只能在当前类当中进行访问 优势 ：让类的调用者，对类的使用成本进一步降低了
 * 继承：extends 子类/派生类  extends  父类 基类 超类
 *      除了构造方法没有被继承
 * super  this
 *
 * 2、子类在构造的时候，要帮助父类进行构造
 * 3、private < default < protected < public
 * 重写 重载 的区别？
 *
 * 子类访问修饰限定符 大于等于  父类访问修饰限定符
 *
 * 运行时绑定\动态绑定：
 * 前提：父类引用 引用子类对象  且父类和子类有同名的覆盖方法
 *    通过父类引用  调用这个覆盖方法  就会发生运行时绑定
 *
 * 理解多态  一个引用可以指向不同的对象
 *
 * 抽象类：包含抽象方法的类 抽象类abstract修饰
 * 1、不能被实例化  不能new
 * 2、目的 是为了被继承
 *
 * 接口：interface
 * 1、成员变量 ：public static final
 * 2、成员方法： public abstract
 * implement A，B，C，D
 * 为了解决 Java的多继承问题
 *
 * Compareable
 * 自定义类型 要可以比较 需要这个接口 compareTo()
 *//*

class Money implements Cloneable{
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable {
    public int age;  //简单类型

    Money m = new Money();  //引用类型

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person p = (Person) super.clone();
        p.m = (Money) this.m.clone();
        return p;
    }
}
public class TestDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);

        System.out.println("=========修改=======");
        person2.m.money = 99.9;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }

    public static void main2(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person1.age);
        System.out.println(person2.age);

        System.out.println("=========修改=======");
        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2 =array.clone();  //浅拷贝

        array2[0] = 99;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
*/
