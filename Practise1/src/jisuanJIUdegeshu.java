import java.util.Scanner;

public class jisuanJIUdegeshu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++) {
            if(i / 10 == 9) {
                cnt++;
            }
            if(i % 10 == 9) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
