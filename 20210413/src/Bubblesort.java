import sun.util.resources.ParallelListResourceBundle;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/13
 * @Time:9:25
 */
public class Bubblesort {
    public void bubblesort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            boolean flat = false;
            for(int j = 0; j < array.length  - 1 - i; j++) {
                if(array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flat = true;
                }
            }
            if(flat == false) {
                break;
            }
        }
    }
    public int[] printSort(int[] array) {
        bubblesort(array);
        return  array;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bubblesort bubblesort = new Bubblesort();
        int[] array = new int[10];
        while(scan.hasNext()) {
            for(int i = 0; i < 10; i++) {
                array [i] = scan.nextInt();
            }
            bubblesort.bubblesort(array);
            int[] arr = new int[array.length];
            arr = bubblesort.printSort(array);
            System.out.println(Arrays.toString(arr));
        }
    }
}
