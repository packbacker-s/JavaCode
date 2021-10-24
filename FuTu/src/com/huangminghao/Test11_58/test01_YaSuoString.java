package com.huangminghao.Test11_58;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/10/23
 * @Time:19:43
 */
public class test01_YaSuoString {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 通用压缩
     * @param inputvalue string字符串 待压缩数据
     * @return string字符串
     */
    public static String compress (String inputvalue) {
        // write code here
        if (inputvalue == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        int count = 1;
        for (int i = 0; i < inputvalue.length() - 1; i++) {
            if (inputvalue.charAt(i) != inputvalue.charAt(i + 1)) {
                sb.append(inputvalue.charAt(i));
                sb.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(inputvalue.charAt(inputvalue.length() - 1));
        sb.append(count);
        if (sb.length() > inputvalue.length()) {
            return inputvalue;
        } else {
            return String.valueOf(sb);
        }
    }

    public static void main(String[] args) {
        String str = "AAABBBBCGG";
        String res = compress(str);
        System.out.println(res.toString());
    }
}
