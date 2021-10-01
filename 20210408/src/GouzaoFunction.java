/**
 * Created with IntelliJ IDEA.
 * Description: 构造方法
 *一个对象的产生 分为几步  是如何产生？
 * 1、为对象分配内存
 * 2、调用合适的构造方法
 * 当没有提供构造方法的时候，编译器会自动提供一个不带有参数的构造方法
 *this关键字代表对象，这句话对还是错？
 * 错，this代表当前对象的引用
 * 构造方法作用： 构造对象的
 * @User:Mingaho
 * @Date:2021/04/08
 * @Time:19:36
 */
class PerSon {
    private String name;
    private int age;
    private static int count;  //public static int count = 0； 静态代码块例子


    public PerSon() {
        //this("caocao", 18);  //只能写在第一行
        //this("zhangfei");  只能调用一个
        //count = 99；  静态代码块例子
        System.out.println("PerSon<int>");
    }


    public PerSon(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("PerSon<String, int>");
    }


    public PerSon(String name) {
        this.name = name;
    }




    public void eat() {
        {
            //本地代码块， 没有意义
        }
        System.out.println(this.getName());
        System.out.println(this.age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PerSon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




    {
        //this.name = "zhangfei";
        //count = 99;
        System.out.println("实例代码块.........");
    }

    static {
        System.out.println("静态代码块.........");
    }


}


public class GouzaoFunction {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        PerSon person1 = new PerSon();
        person1.eat();

        //没有名字的对象 只能使用一次 再次使用只能再次创建
        new PerSon().eat();
    }

    /**
     * 代码块
     * 实例代码块/构造代码块
     * 特性：
     *
     *
     *
     * 静态代码块:只会被执行一次，且最早被执行
     *
     * 如果都是静态的，打印的顺序和定义的前后顺序有关，前面的先被执行
     *
     *
     *
     * 本地代码块 ：只做了解 不会用的
     * @param args
     */
    public static void main2(String[] args) {
        PerSon person1 = new PerSon();
        System.out.println("================");
        PerSon person2 = new PerSon();

    }



    public static void main1(String[] args) {
        PerSon person1 = new PerSon();
        //PerSon person2 = new PerSon("bit", 18);

    }
}
