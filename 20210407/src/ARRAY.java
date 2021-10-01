import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *   数组
 *   new是一个实例化对象
 *   栈上的地址 是拿不到的
 *   堆上的地址 可以打印 但不是真实的
 *   Arrays操作数组的工具类
 *
 *   int[] array = {1,2,3,4};
 *   int[] array = new int[100];
 *
 * @User:Mingaho
 * @Date:2021/04/07
 * @Time:16:59
 */
public class ARRAY {

    /**
     * 数组进行参数进行传递
     * @param args
     */
    public static void print(int[] arr) {
       /* for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        for (int x: arr
             ) {
            System.out.print(x + " ");
        }
    }

    public static void swap(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1]  = temp;
    }



    public static int[] func(int[] array) {
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            temp [i] = array[i] * 2;
        }
        return temp;
    }



    public static String toMyString(int[] array) {
        String ret = "[";
        for(int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;

    }

    public static int[] CopyArray(int[] array) {
        int[] ret = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }


    public static int maxArrayIndex(int[] array) {
        int temp = array[0];
        for(int i = 1; i < array.length; i++) {
            if(temp < array[i]) {
                temp = array[i];
            }
        }
        return temp;
    }


    public static int[] BubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            boolean flat = false;
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
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
        return array;
    }



    public static void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while(left < right) {
            int temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }
    }

    public static void swapJiOuShu(int [] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            while(left < right && array[left] % 2 == 0) {
                left++;
            }
            while(left < right && array[right] % 2 != 0) {
                right--;
            }
            if(left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }

    public static void main13(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] ret = new int[array.length];
        //ret = BubbleSort(array);
        //System.out.println(Arrays.toString(ret));
        swapJiOuShu(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main12(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        int[] array = {1,32,54,2,8,90,5,4,7,0};
        int[] ret = new int[array.length];
        ret = BubbleSort(array);
        System.out.println(Arrays.toString(ret));
        BubbleSort(array);
        System.out.println(Arrays.toString(array));

    }


    public static void main10(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int temp = maxArrayIndex(array);
        System.out.println(temp);
    }


    public static void main9(String[] args) {       //数组拷贝
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = CopyArray(array);
        System.out.println(Arrays.toString(ret));
        int[] ret1 = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret1));
        int[] ret2 = new int[array.length];
        System.arraycopy(array, 0, ret2, 0, array.length);
        System.out.println(Arrays.toString(ret2));
        int[] ret3 = array.clone();
        System.out.println(Arrays.toString(ret3));
    }




    public static void main8(String[] args) {
        int[] array = {1,2,3,4,5,6};
        String ret = toMyString(array);
        System.out.println(toMyString(array));
        System.out.println(ret);

    }


    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int [10];
        for(int i = 0; i < 10; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }



    public static void main6(String[] args) {
        int[] array = {4,2,6,1};
        int[] ret =  func(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(array));

    }

    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
    }


    public static void main4(String[] args) {
        /*int[] array = {1,2,3,4};
        print(array);*/
        int[] array2 = {10, 20};
        System.out.println(array2[0] + " " + array2[1]);
        swap(array2);
        System.out.println(array2[0] + " " + array2[1]);

    }



    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        int len = array.length;
      /*  for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/
        for (int val : array) {
            System.out.print(val + " ");
        }
    }


    public static void main1(String[] args) {
        int[] array = {1,2,3,4};   //整体初始化
        int[] array2 = new int[]{1,2,3,4};
        int[] array3 = new int[4];  //都是0

        for(int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }
    }
}
