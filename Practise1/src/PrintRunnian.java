import java.util.Scanner;

public class PrintRunnian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i = a; i <= b; i++) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + "是闰年！");
            } else {
                System.out.println(i + "不是闰年！");
            }
        }
    }
}
