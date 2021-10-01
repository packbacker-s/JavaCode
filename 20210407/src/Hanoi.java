import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/07
 * @Time:10:16
 */



public class Hanoi {
    public static void move(char pos1, char pos2) {
        System.out.print(pos1 + "->" + pos2 + " ");
    }
    public static void hanoi(int n, char pos1, char pos2, char pos3) {
        if(n == 1) {
            move(pos1, pos3);
        } else {
            hanoi(n - 1, pos1, pos3, pos2);
            move(pos1, pos3);
            hanoi(n - 1, pos2, pos1, pos3);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt();
            hanoi(a, 'A', 'B', 'C');
            System.out.println();
        }

    }
}
