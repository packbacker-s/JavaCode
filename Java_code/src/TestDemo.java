import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {


    /**
     *
     * @param args
     */
    public static void main13(String[] args) {

    }
    /**
     * while 语句
     * @param args
     */
    public static void main(String[] args) {
        int num = 5;
        int ret = 1;
        int sum = 0;
        int n = 1;
        while(num >= n) {
            ret *= n;
            sum += ret;
            n++;
        }
        System.out.println(sum);
        /*int num = 5;
        int sum = 0;
        for(int i = num; i >= 1; i--) {
            int ret = 1;
            int n = 1;
            while(n <= i) {
                ret *= n;
                n++;
            }
            sum += ret;
        }
        System.out.println(sum);*/
    }
    /**
     * switch语句
     * @param args
     */
    public static void main11(String[] args) {
        int a = 1;
        switch(a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("请输入正确的数字");
                break;
        }
    }
    public static void main10(String[] args) {
        /**
         * 判断是否是闰年
         */
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int year = scan.nextInt();
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        }
    }
    /**
     *       持续输入输出
     * @param args
     */
    public static void main8(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.next();
            System.out.println(str);
            int a = scan.nextInt();
            System.out.println(a);
            /*if(true) {
                System.out.println("you are right");
            }*/
            //scan.close();
        }
    }
    /**
     * 输入输出
     * @param args
     */
    public static void main7(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();  //遇到回车键结束
        System.out.println(str);
        String str1 = s.next();     //遇到空格则结束
        System.out.println(str1);
    }
    public static void main6(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.close();
        System.out.println(a);

    }

    /**
     * int string 的相互转换
     * @param args
     */
    public static void main5(String[] args) {
        int num  = 10;
        String str1 = num + "";
        System.out.println(str1);
        //2种
        String str2 = String.valueOf(num);
        System.out.println(str2);

        String str3 = "100";
        int a = Integer.parseInt(str3);
        System.out.println(str3);
    }
    /**
     * 隐式类型转换 显式类型转换
     * @param args
     */
    public static void main4(String[] args) {
        //隐式
        int a = 10;
        long b = a;
        System.out.println(b);
        //显式
        long c = 20;
        int d = (int)c;
        System.out.println(d);
    }
    /**
     * 常量只能被初始化一次
     */
    public static void main3(String[] args) {
        final int MAXNUM = 10;
        //MAXNUM =999;错的
        System.out.println(MAXNUM);
    }
    /**
     * 字符串数据类型
     * String
     *
     */
    public static void main2(String[] args) {
        String str = "\"hello\"";
        System.out.println(str);
    }
    /**
     * 小于4个字节的数据类型进行运算的时候 会发生类型的提升
     *
     */
    public static void main1(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a+b;
        //必须加强制转类型  或将c 变为int类型
        byte c = (byte)(a+b);
        System.out.println(c);
    }
}
