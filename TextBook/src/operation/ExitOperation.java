package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:14:06
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
