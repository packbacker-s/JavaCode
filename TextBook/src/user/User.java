package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:继承
 *
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:14:16
 */
public abstract class User {
    protected String name;

    protected IOperation[] operations;//定义数组

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(BookList bookList, int choice) {
        this.operations[choice].work(bookList);
    }

}
