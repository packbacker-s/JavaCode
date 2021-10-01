package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:14:17
 */
public class Admin extends User {
    public Admin(String name) {
        //this.name = name;
        super(name);
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DeleteOperation(),
                new DisplayOperation()

        };
    }

    @Override
    public int menu() {
        System.out.println("=======================");
        System.out.println("hello" + this.name + "欢迎来到图书系统");
        System.out.println("1、查找图书");
        System.out.println("2、新增图书");
        System.out.println("3、删除图书");
        System.out.println("4、显示所有图书");
        System.out.println("0、退出系统");
        System.out.println("=======================");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
}
