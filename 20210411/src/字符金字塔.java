import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/11
 * @Time:21:12
 */
public class 字符金字塔 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            char ch = scan.nextLine().charAt(0);
            for(int i = 1; i <= 5; i++) {
                for(int j = 1; j <= 5 - i; j++) {
                    System.out.print(" ");
                }
                for(int j = 1; j <= 2*i - 1; j++) {
                    if((j + 1) % 2 == 0) {
                        System.out.print(ch);
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

}
