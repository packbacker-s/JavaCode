import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *二维数组\ 操作数组的类Arrays
 * @User:Mingaho
 * @Date:2021/04/08
 * @Time:9:28
 */
public class TwoArray {


    /**
     * 一个数组 只有一个数字出现了一次 其余出现了2次
     * 找出数组只出现一次的数字
     * 考察位运算符 & | ^
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1,4,3,1,2,4,3};
        int ret = 0;
        for(int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }
    /**
     * 不规则的二维数组
     * @param args
     */
    public static void main4(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[] {1,2,3};
        array[1] = new int[] {4,5};
        //c语言 是可以指定列 行可以自行推导
        //Java 行必须指定  列 不可以自行推导
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }
    /**
     *二维数组利用foreach打印数组
     * @param args
     */
    public static void main3(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}};
        for (int[] temp : array1) {
            for (int x : temp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    /**
     * 二维数组的打印
     * @param args
     */
    public static void main2(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}};
        /*for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }*/
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.deepToString(array1));  //深度打印
    }

    /**
     * 二维数组的定义方式
     * @param args
     */
    public static void main1(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] arary2 = new int[][] {{1,2,3}, {4,5,6}};
        int[][] array3 = new int[2][3];
    }

}
