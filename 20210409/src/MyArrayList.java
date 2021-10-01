import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/09
 * @Time:13:32
 */
public class MyArrayList {
    public int[] elem;    //数组
    public int usedSize;   //有效的数据容量
    public static final int capacity = 10;  //初始容量

    public MyArrayList() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    private void checkPos(int pos) {       //判定位置是否合法
        if(pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos' location is not right!");
        }
    }

    private boolean isEmpty() {
        /*if(this.usedSize != 0) {
            return false;
        }
        return true;*/
        return  this.usedSize == 0;
    }

    private boolean isFull() {
        /*if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
    }

    //打印顺序表
    public void display() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(this.elem));
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        checkPos(pos);
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
            //return;
        }
        //挪数据
        for(int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }


    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }


    //查找某个元素对应的下标位置
    public int search(int toFind) {
        for(int i = 0; i < this.usedSize; i++) {
            if(toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }


    //获取pos下标位置的元素
    public int getPos(int pos) {
        //顺序表是否为空
        if(isEmpty()) {
            //return -1;
            throw new RuntimeException("顺序表为空！"); //手动抛出异常
        }
        //pos是否合法
        if(pos < 0 || pos >= this.usedSize) {
            return -1;
        }
        //checkPos(pos);
        return this.elem[pos];
    }


    //给pos位置的元素设为 value
    public void setPos(int pos, int value) {
        //checkPos(pos);
        if(pos < 0 || pos >= this.usedSize) {
            return;
        }
        int ret = search(pos);
        if(ret == -1) {
            return;
        }
        this.elem[ret] = value;
    }


    //删除第一次出现的关键字key
    //是否有该关键字
    //找关键字在哪里 并且知道下标
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("number is not need to delete ");
            return;
        }
        for(int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
       /* int i;
        for(i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toRemove) {
                break;
            }
        }
        for(int j = i; j < this.usedSize - 1; j++) {
            this.elem[j] = this.elem[j + 1];
        }
        this.usedSize--;*/
    }


    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }


    //清空顺序表
    public void clear() {
        this.usedSize = 0;
    }


    /*public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        System.out.println();

    }*/

}
