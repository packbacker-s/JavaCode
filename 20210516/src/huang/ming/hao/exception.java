package huang.ming.hao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/05/16
 * @Time:16:22
 */
public class exception {
    public static int func1() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[4]);
            return 1; //遇到异常肯定不会执行
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("数组越界异常");
            return 2;
        }finally {
            return 3; //finally肯定会被执行

        }
    }

    public static int divide(int x, int y) throws ArithmeticException {
        if(y == 0) {
            throw new ArithmeticException("y == 0");
        }
        return x/y;
    }

    public static void main(String[] args) {

        try {
            int ret = divide(20,0);
            System.out.println(ret);
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("hhhh");
        }
        System.out.println("继续执行");
    }


    public static void main2(String[] args) {
        System.out.println(func1());   //打印结果为:
    }                                  // 数组越界异常
                                       // 3


   public static void main1(String[] args) {
       int[] array = {1, 2, 3};
       try {
           System.out.println(array[4]);
       }catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
           System.out.println("数组越界异常");
       }

       System.out.println("hello world!");
   }
}
