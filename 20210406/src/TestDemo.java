import com.sun.javaws.IconUtil;
import com.sun.org.apache.xerces.internal.impl.xs.XSComplexTypeDecl;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/06
 * @Time:10:42
 */
public class TestDemo {

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            for(int i= 31; i >= 1; i -= 2) {
                System.out.print(((a >> i) & 1) + " ");
            }
            System.out.println();
            for(int i = 30; i >= 0; i -= 2) {
                System.out.print(((a >> i) & 1) + " ");
            }
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            int count = 0;
            while(a != 0) {
                a = a & (a - 1);
                count++;
            }
            System.out.println(count);

        }
    }


    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            int count = 0;
            for(int i = 0; i < 32; i++) {
                if(((a >> i) & 1) == 1) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
