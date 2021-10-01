package com.haungminghao.Strings;

import com.sun.javafx.binding.BidirectionalBinding;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/09/20
 * @Time:19:23
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1).append(1.234).append("abc").append(true);
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());

        System.out.println("=============");

        StringBuilder stringBuilder = new StringBuilder();
    }
}
