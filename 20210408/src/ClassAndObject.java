/**
 * Created with IntelliJ IDEA.
 * Description:
 *  OOP的三大特征：
 *  访问修饰限定符
 *  public    公有的
 *  private   私有的
 *  protected  受保护的
 *  什么都不写  默认权限->包访问权限
 * @User:Mingaho
 * @Date:2021/04/08
 * @Time:10:22
 */
class Person {
    //字段->成员变量   定义在方法外边 类的里面
    //实例成员变量：对象里面
    //实例成员没有初始化，默认值为对应的0值  引用类型默认为null， 简单类型为默认值为0
    //char->'\u0000'  bollean -> false
    public String name = "Minghao";
    public int age = 22;
  /*  public char ch;
    boolean flat;*/
    //静态成员变量 不属于对象
    public static int size;



    //方法->行为 没有加static为实例成员方法
    public void eat() {
        int a = 10;   //局部变量
        System.out.println("eat()！");
    }
    public void sleep() {
        System.out.println("sleep()!");
    }

    public static void func1() {
        System.out.println("func!");
        //age = 99;  error 静态方法内部 不能访问非静态的数据成员
        size = 999;
    }

    public void show() {
        System.out.println("my name is " + name + "," + "I was " + age + " years old.");
    }


}







public class ClassAndObject {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * 没有加static为实例成员方法
     * @param args
     */
    public static void main4(String[] args) {
        Person person = new Person();
        /*person.eat();
        person.sleep();
        //person.func1();//报警告
        Person.func1();*/
        person.show();
        person.name = "lisi";
        person.age = 30;
        person.show();
    }
    /**
     * 如何访问静态数据成员
     * 类名.静态成员变量
     * @param args
     */
    public static void main3(String[] args) {
       /* Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.size);*/
        System.out.println(Person.size);
    }
    /**\
     *
     * @param args
     */
    public static void main2(String[] args) {
        Person preson = new Person();
        preson.name = "HuangMinghao";
        System.out.println(preson.name);
        System.out.println(preson.age);
       /* System.out.println(preson.ch);
        System.out.println(preson.flat);*/
    }
    /**
     * 实例化一个对象 通过关键字new
     * @param args
     */
    public static void main1(String[] args) {
        Person preson1 = new Person();
        Person preson2 = new Person();
        Person preson3 = new Person();
        Person preson4 = new Person();
        Person preson5 = new Person();

    }
}
