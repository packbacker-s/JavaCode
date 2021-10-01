/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/14
 * @Time:19:30
 */
public class TestDemo1 {
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addFirst(1);
        myLinkList.addFirst(2);
        myLinkList.addFirst(3);
        myLinkList.addFirst(4);
        myLinkList.addFirst(5);
        myLinkList.display();

        /*myLinkList.addLast(1);
        myLinkList.addLast(2);
        myLinkList.addLast(3);
        myLinkList.addLast(4);
        myLinkList.addLast(5);
        myLinkList.display();

        boolean flat = myLinkList.contains(8);
        System.out.println(flat);

        int length = myLinkList.size();
        System.out.println(length);*/

        myLinkList.addIndex(99, 0);
        myLinkList.display();
        myLinkList.addIndex(88, 6);
        myLinkList.display();

        myLinkList.removeKey(99);
        myLinkList.display();
    }
}
