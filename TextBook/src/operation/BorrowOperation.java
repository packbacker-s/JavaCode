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
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scan.nextLine();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                //可以借阅
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("没有你要借阅的那本书");
    }
}
