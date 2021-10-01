/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/09
 * @Time:9:51
 */
public class ShunXuBio {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
       /* myArrayList1.add(0,12);
        myArrayList1.add(1,18);
        myArrayList1.add(2,3);
        myArrayList1.add(3,21);*/
        for (int i = 0; i < 8; i++) {
            myArrayList1.add(i,i);
        }
        System.out.println(myArrayList1.size());
        myArrayList1.display();
        myArrayList1.add(8,122);
        myArrayList1.display();

      /*  System.out.println(myArrayList1.getPos(4));
        myArrayList1.display();*/
        myArrayList1.remove(4);
        myArrayList1.display();

      /*  System.out.println("clear");
        myArrayList1.clear();
        myArrayList1.display();*/

        myArrayList1.setPos(8,88);
        myArrayList1.display();

        /*System.out.println("===============");
        System.out.println(myArrayList1.search(51));
        System.out.println(myArrayList1.contains(15));*/

    }
}
