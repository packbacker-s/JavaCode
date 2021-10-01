import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/09
 * @Time:9:55
 */
class Test {
    public static void hello() {   //静态
        System.out.println("hello");
    }
}
class Calculator {
    private int num1;
    private int num2;

   /* public int getNum1() {     Alt + Insert
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
*/
        public int getNum1() {
            return this.num1;
        }
        public void setNum1(int num1) {
            this.num1 = num1;
        }
        public int getNum2() {
            return this.num2;
        }
        public void setNum2(int num2) {

            this.num2 = num2;
        }
    public int add() {
        return this.num1 + this.num2;
    }
    public int sub() {
        return this.num1 - this.num2;
    }
    public int mul() {
        return this.num1 * this.num2;
    }
    public double dev() {
        return this.num1 * 1.0 / this.num2;
    }
}

class MyValue {
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }


}
public class HomeWok {


    public static void swap(MyValue myValue1, MyValue myValue2) {
        int temp = myValue1.getVal();
        myValue1.setVal(myValue2.getVal());
        myValue2.setVal(temp);

    }


    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.setVal(10);

        MyValue myValue2 = new MyValue();
        myValue2.setVal(20);

        swap(myValue1, myValue2);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());

    }

    /**
     * 用类实现加减乘除
     * @param args
     */
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        Calculator calculator = new Calculator();
        calculator.setNum1(a);
        calculator.setNum2(b);
        int ret1 = calculator.add();
        int ret2 = calculator.sub();
        int ret3 = calculator.mul();
        double ret4 = calculator.dev();
        System.out.println(ret1);
        System.out.println(ret2);
        System.out.println(ret3);
        System.out.println(ret4);
    }


    public static void main1(String[] args) {
        Test test = null;  //静态不依赖对象
        test.hello();     //只是会有警告
    }
}
