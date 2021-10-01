import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;
import book.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/17
 * @Time:13:19
 */


public class TestMain {
    public static User login() {       //User用到了向上转型
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scan.nextLine();
        System.out.println("请输入你的身份：1 -> 管理员， 2 -> 普通用户");
        int choice = scan.nextInt();
        if(choice == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }


    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();
        //登录mignaho
        User user = login();
        while (true) {
            int choice = user.menu();//选择是几  就可以对应哪个方法了

            user.doOperation(bookList, choice);
        }
    }
}
