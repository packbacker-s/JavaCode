package book;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:13:23
 */
public class BookList {
    private Book[] books = new Book[100];//容量
    private int usedSize = 0;

    public BookList() {
        books[0] = new Book("围城","钱钟书", 32,"文学小说");
        books[1] = new Book("巨流河","齐邦媛", 45,"文学小说");
        books[2] = new Book("西游记","吴承恩", 22,"神话小说");
        this.usedSize = 3;
    }

    //我们可以把所有的操作都写在这个类中  因为每一个操作都是操作books

    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
