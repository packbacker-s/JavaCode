package operation;

import book.BookList;

import java.util.Scanner;

import book.*;

/**
 * Created with IntelliJ IDEA.
 * Description: 新增图书
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:13:41
 */
public class AddOperation implements IOperation {
    /*public void work(BookList bookList) {  //对书的各种操作针对的都是在BookList上  只是实现的内容不一样

    }*/

    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scan.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scan.nextLine();
        System.out.println("请输入图书的价格：");
        int price = scan.nextInt();
        System.out.println("请输入图书的类型：");
        String type = scan.next();

        Book book = new Book(name, author, price, type);
        int curSize = bookList.getUsedSize();
        bookList.setBooks(curSize, book);
        bookList.setUsedSize(curSize + 1);
        System.out.println("新增图书成功");
    }

    /*@Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scan.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scan.nextLine();
        System.out.println("请输入图书的价格：");
        double price = scan.nextInt();
        System.out.println("请输入图书的类型：");
        String type = scan.nextLine();



    }*/



}
