package huang.ming.hao;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 输入一个字符串，求出该字符串包含的字符集合
 * 输入描述:
 * 每组数据输入-一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写, .
 * 输出描述:
 * 每组数据- -行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
 * 输入
 * abcqweracb
 * 输出
 * abcqwer
 *
 * @User:Mingaho
 * @Date:2021/05/22
 * @Time:19:03
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String temp = sb.toString();
                if(!temp.contains(ch + "")) {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }

}
