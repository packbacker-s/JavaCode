import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/13
 * @Time:9:58
 */
public class Selectsort {
    public int[] printSort(int[] array) {
        selectsort(array);
        return array;
    }
    public void selectsort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int maxPos = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[maxPos] > array[j]) {
                    maxPos = j;
                }
            }
            if(maxPos != i) {
                int temp = array[i];
                array[i] = array[maxPos];
                array[maxPos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Selectsort selectsort = new Selectsort();
        int[] array = {7, 8, 5, 0, 9, 3};
        selectsort.selectsort(array);
        int[] arr = new int[array.length];
        arr = selectsort.printSort(array);
        System.out.println(Arrays.toString(arr));
    }
}
