package com.BiShi.Test14_Shopee;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/25
 * @Time:16:25
 */
public class test03_reverse {
    public static String reverse(String s) {
        if (s == null || s.equals("")) {
            return null;
        }
        String str = s.substring(1, s.length() - 1);//去掉引号""
        char[] chars = str.toCharArray();
        //int index = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ',' || String.valueOf(str.charAt(i)).equals(" ")) {
                count++;
            }
        }
        StringBuilder[] sb = new StringBuilder[count];
        for (int i = 0; i < count; i++) {
            for (int index = 0; index < chars.length; index++) {
                if (!String.valueOf(str.charAt(index)).equals(" ")) {
                    sb[count].append(str.charAt(index));
                } else {
                    index = index + 1;//下一次起始位置
                    continue;
                }
            }
        }
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < sb.length; i++) {
            for (int j = 0; j < sb[i].length()/2; j++) {
                int len = sb[i].length();
                char[] arr1 = (sb[i].toString()).toCharArray();
                char c = arr1[j];
                arr1[j] = arr1[len - i -1];
                arr1[len - i -1] = c;
            }
            sb1.append((String.valueOf(sb[i]).toCharArray()));
        }

        for (int i = 0; i < sb.length; i++) {
            sb1.append(sb[i]);
        }
        return sb1.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("===");
        String str1 = "\"I am Minghao,hello world\"";
        String res = str1.substring(1, str1.length() - 1);
        System.out.println(res + " 长度： " + res.length());
        while (scan.hasNext()) {
            String str = scan.next();
            String s = str.substring(1, str.length() - 1);//去掉引号""
            System.out.println(s + " 长度： " + str.length());
            //String res = reverse(str);
            //System.out.println(res);


        }
    }
}
