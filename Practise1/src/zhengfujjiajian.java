import java.util.Scanner;

public class zhengfujjiajian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        int flat = 1;
        for(int i = 1; i <= n; i++) {
            sum = sum + 1.0/i * flat;
            flat = - flat;
        }
        System.out.println(sum);
    }
}
