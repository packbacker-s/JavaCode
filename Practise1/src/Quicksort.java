/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/12
 * @Time:20:57
 *//*

*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/12
 * @Time:20:39
 *//*

import java.util.Arrays;
import java.util.Scanner;
public class Quicksort {
   */
/* public int[] printQuickSort(int[] array) {
        quicksort(array, 0, array.length - 1);
        return array;
    }*//*

    public void quicksort(int[] array, int low, int right) {
        if(low < right) {
            int i = low;
            int j = right;
            int temp = array[low];
            while(i < j) {
                while(i < j && temp <= array[j]) {
                    j--;
                }
                if(i < j) {
                    array[i] = array[j];
                    i++;
                }
                while(i < j && array[i] <= temp) {
                    i++;
                }
                if(i < j) {
                    array[j] = array[i];
                }
            }
            array[i] = temp;
            quicksort(array, 0, i - 1);
            quicksort(array, i + 1, array.length - 1);
        }
    }
    public static void main() {
        Quicksort quicksort = new Quicksort();
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        while (scan.hasNext()) {
            for(int i = 0; i < 10; i++) {
                array[i] = scan.nextInt();
            }
            quicksort.quicksort(array, 0, array.length - 1);
            //quicksort.printQuickSort(array);
            System.out.println(Arrays.toString(array));
        }
    }
}
*/
