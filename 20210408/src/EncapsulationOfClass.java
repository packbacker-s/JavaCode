/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * 无特殊要求 属性设置为私有的
 *类的封装
 * 封装：用private来修饰属性 或者方法
 *
 *
 * this 当前对象的引用m
 * @User:Mingaho
 * @Date:2021/04/08
 * @Time:15:58
 */

class Student {
    private String MyName;//限定只能在类中访问
    private int age;

    //提供一个公开的接口
    //Alt + Insert 自己生成

    public String getMyName() {
        return MyName;
    }

    public void setMyName(String myName) {
        MyName = myName;  //名字不规范 所以没有this   name就有
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 /*   public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String getMyName() {
        return this.MyName;
    }

    public void setMyName(String name) {    //public void (String MyName)
        MyName = name;                        //  this.MyName = MyName;
    }*/

    public void func1() {
        System.out.println("func1()");
    }

    //重新实现了一下Objict类的 toString()方法
    //Object是所有类的父类
    @Override  //注解：这个注解指的是  这个方法是重新写的
    public String toString() {   //Alt + Insert 选  toString()
        return "Student{" +
                "MyName='" + MyName + '\'' +
                ", age=" + age +
                '}';
    }

    public void show() {
        System.out.println("my name is " + this.MyName + "," + "I was " + this.age + " years old.");

    }


}
//以上是类的实现者写的代码

//以下是类的调用者
public class EncapsulationOfClass {






    public static void main(String[] args) {

        Student student = new Student();
        student.setMyName("Minghao");
        student.setAge(18);
        int age = student.getAge();
        String str = student.getMyName();
        System.out.println(str);
        System.out.println(age);
        //student.show();
        System.out.println(student);
    }
}
