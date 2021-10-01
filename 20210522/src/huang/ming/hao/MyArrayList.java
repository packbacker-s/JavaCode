package huang.ming.hao;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/05/28
 * @Time:15:25
 *
 * T只是一个占位符，表示当前类是一个泛型类
 *
 */
public class MyArrayList<T, E, V, K> {
    public Object[] elem;
    public int usedSize;

    //构造方法
    public MyArrayList() {
        this.elem = new Object[10];
        this.usedSize = 0;
    }
    //默认放到数组最后
    public void add(Object val) {
        this.elem[this.usedSize] = val;
        usedSize++;
    }
    public Object getVal(int pos) {
        return this.elem[pos];
    }


    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        MyArrayList myArrayList2 = new MyArrayList();
        myArrayList1.add("hello");
        myArrayList1.add(2);
        String val = (String)myArrayList1.getVal(0);
        System.out.println(val);
    }
}
