package huang.ming.hao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/05/17
 * @Time:20:31
 */

class MyException extends RuntimeException {  //自定义一个异常 继承于运行时异常父类
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class TestDemo {
    public static void func(int x) {
        if(x == 10) {
            throw new MyException("x == 10");
        }
    }

    /**
     * 登录的异常
     * @param args
     */

    private String userName = "admin";
    private String password = "123456";

    public static void login(String userName, String password) throws UserException, PasswordException {
        TestDemo testDemo = new TestDemo();
        if (!testDemo.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }
        if (!testDemo.password.equals("123456")) {
            throw new PasswordException("密码错误");
        }
    }
    public static void main(String[] args) {
            try {
                login("admin", "123456");
            } catch (UserException userException) {
                userException.printStackTrace();
            } catch (PasswordException passwordException) {
                passwordException.printStackTrace();
            }
    }



    public static void main1(String[] args) {
        try {
            func(10);
        } catch(MyException e) {
            e.printStackTrace();
        }

    }
}
