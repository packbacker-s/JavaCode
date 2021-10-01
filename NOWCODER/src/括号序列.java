import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/04/13
 * @Time:16:44
 */
public class 括号序列 {
    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if(ch == '(' || ch == '[' || ch == '{') {   //左括号直接入栈
                stack.push(ch);
            }else {                                       //否则出栈比对
                if(stack.isEmpty()) {
                    return false;
                }
                if(ch == ')' && stack.pop() != '(') {
                    return false;
                }
                if(ch == ']' && stack.pop() != '[') {
                    return false;
                }
                if(ch == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
        // write code here
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        括号序列 KuoHao = new 括号序列();
        while(scan.hasNext()) {
            String s = scan.nextLine();
            //KuoHao.isValid(s);
            boolean flat = KuoHao.isValid(s);
            System.out.println(flat);
        }
    }
}
