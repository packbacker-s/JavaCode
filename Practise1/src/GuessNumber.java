import java.util.Random;
import java.util.Scanner;
//import java.util.*;  表示导入util下所有的包
public class GuessNumber {
    /**
     * 猜数字
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();   //若加上时间戳， 随机数则不变  Random random = new Random(23); 任意数字
        int randNum = random.nextInt(100);//若是范围随机数 int randNum = random.nextInt(100) + 100;
        //System.out.println(randNum);
        while(true) {
            System.out.println("请输入你要猜的数字：");
            int num = scan.nextInt();
            if(num < randNum) {
                System.out.println("你猜的数字小了！再猜一次！");
            } else if (num == randNum) {
                System.out.println("恭喜你猜对了！");
                break;
            } else {
                System.out.println("你猜的数字大了！再猜一次！");
            }
        }
    }
}
