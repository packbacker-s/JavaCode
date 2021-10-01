package operation;

import book.BookList;

public interface IOperation {

    void work(BookList bookList);  //对书的各种操作针对的都是在BookList上  只是实现的内容不一样



}
