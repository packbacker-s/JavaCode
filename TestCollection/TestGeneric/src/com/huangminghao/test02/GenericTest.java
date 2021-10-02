package com.huangminghao.test02;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * GenericTest就是一个普通类
 * GenericTest<A>就是一个泛型类
 * <>里面就是一个参数类型， 类型是引用数据类型 而不是基本数据类型
 *
 * @User:Mingaho
 * @Date:2021/10/02
 * @Time:9:24
 */
public class GenericTest<E> {
    int age;
    String name;
    E sex;

    public void a(E n) {

    }

    public void b(E[] m) {

    }
}


//继承时，父类指定特定的泛型类
class SubGenericTest extends GenericTest<Integer> {

}


//继承时，父类不指定泛型，子类也是一个泛型类
class SubGenericTest2<E> extends GenericTest<E> {

}


class Demo {
    public static void main(String[] args) {

        //指定父类泛型，子类不需要指定
        SubGenericTest sub = new SubGenericTest();
        sub.a(19);
    }
}

class Demo2 {
    public static void main(String[] args) {
        SubGenericTest2<String> sub2 =  new SubGenericTest2<>();
        sub2.sex = "女";
    }
}




class Test {
    public static void main(String[] args) {
        //GenericTest进行实例化
        //实例化的时候不指定泛型  默认为Object类型数据
        GenericTest gt1 = new GenericTest();
        gt1.a("abc");
        gt1.a(9.8);
        gt1.b(new String[] {"a", "b", "c"});


        //实例化的时候指定泛型
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.name = "Minghao";
        gt2.b(new String[] {"a", "b", "c"});
        gt2.a("abc");
        gt2.sex = "男";


    }
}
