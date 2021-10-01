import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/06
 * @Time:16:03
 */
public class Function {
    public static int maxNum(int a, int b) {
        return a > b ? a : b;
    }
    public static int maxThreeNum(int a, int b, int c) {
        return maxNum(maxNum(a, b), c);
    }

    public static int fun(int a) {
        int ret = 1;
        for(int i = 1; i <= a; i++) {
            ret *= i;
        }
        return ret;
    }

    public static void func1(int a) {
        if(a > 9) {
            func1(a /10);
        }
        System.out.println(a % 10);
    }

    public static int func(int n) {
        if(n == 1) {
            return 1;
        }
        return n * func(n - 1);
    }


    public static int sum(int a) {
        if(a == 1) {
            return 1;
        }
        return a + sum(a - 1);
    }


    public static int func2(int n) {
        if(n < 10) {
            return n;
        }
        return n % 10 + func2(n / 10);
    }


    public static int func3(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return func3(n-1) + func3(n - 2);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            long ret = func3(a);
            System.out.println(ret);
        }
    }




    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            int ret = func2(a);
            System.out.println(ret);
        }
    }



    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            //int sum = 0;
            int ret = sum(a);
            System.out.println(ret);
        }
    }


    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            /*int ret = func(a);
            System.out.println(ret);*/
            func1(a);
        }

    }




    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            int sum = 0;
            for(int i = 1; i <= a; i++) {
                sum += fun(i);
            }
            System.out.println(sum);
        }
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int ret = maxThreeNum(a, b, c);
            System.out.println(ret);
        }
    }
}
