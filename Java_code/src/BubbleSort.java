import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void bubblesort(int[] a, int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println("\n");
        //System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        for(int i = 0; i < b; i++) {
            a[i] = s.nextInt();
        }
        s.close();

        //System.out.println(Arrays.toString(a));
        BubbleSort bubble = new BubbleSort();
        bubble.bubblesort(a, a.length);
       // bubblesort(a, a.length);

    }
}
