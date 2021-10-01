import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/13
 * @Time:8:50
 */
public class Quicksort {
    public int[] printArray(int[] array) {
        quicksort(array, 0, array.length - 1);
        return array;
    }
    public void quicksort(int[] array, int low, int right) {
        if(low < right) {
            int i = low;
            int j = right;
            int temp = array[low];
            while(i < j) {
                while (i < j && temp <= array[j]) {
                    j--;
                }
                if(i < j) {
                    array[i] = array[j];
                }
                while(i < j && array[i] <= temp) {
                    array[j] = array[i];
                    i++;
                }
            }
            array[i] = temp;
            quicksort(array, low, i - 1);
            quicksort(array, i + 1, right);
        }
    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        Quicksort quicksort = new Quicksort();
        int[] array = new int[10];
        while(scan.hasNext()) {
            for(int i = 0; i < 10; i++) {
                array[i] = scan.nextInt();
            }
            quicksort.quicksort(array, 0, array.length - 1);
            int[] ret = new int [array.length];
            ret = quicksort.printArray(array);
            System.out.println(Arrays.toString(ret));
        }
    }
}
