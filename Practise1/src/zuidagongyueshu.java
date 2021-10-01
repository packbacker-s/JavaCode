import java.util.Scanner;

public class zuidagongyueshu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = b;
        int m = a, n = b;
        while(m % n != 0) {
            c = m % n;
            m = n;
            n = c;
        }
        System.out.println(a +"和" + b + "的最大公约数是" + c);
    }
}
