package user;

import com.sun.javaws.IconUtil;
import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:14:18
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }


    @Override
    public int menu() {
        System.out.println("=======================");
        System.out.println("hello" + this.name + "欢迎来到图书系统");
        System.out.println("1、查找图书");
        System.out.println("2、借阅图书");
        System.out.println("3、归还图书");
        System.out.println("0、退出图书");
        System.out.println("=======================");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;

    }
}
