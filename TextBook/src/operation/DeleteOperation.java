package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:14:05
 */
public class DeleteOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入删除图书的名字：");
        String name = scan.nextLine();

        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                break;
            }
        }
        if(i == bookList.getUsedSize()) {
            System.out.println("没有这本书");
            return;
        }
        //删除图书 跟顺序表一样
        for (int pos = i; pos < bookList.getUsedSize() - 1; pos++) {
            Book book = bookList.getBook(pos + 1);
            bookList.setBooks(pos,book);
        }
        bookList.setUsedSize(bookList.getUsedSize() - 1);
        System.out.println("删除图书成功");
    }
}
