package com.jd.line.javacodeformat.com.jd.line.format;

import java.util.ArrayList;
import java.util.List;

/**
 * Format13 class
 * 【强制】在无泛型限制定义的集合赋值给泛型限制的集合时，在使用集合元素时，需要进行instanceof判断，避免抛出ClassCastException异常。
 * 说明：毕竟泛型是在JDK5后才出现，考虑到向前兼容，编译器是允许非泛型集合与泛型集合互相赋值。
 *
 * @author rongran
 * @date 2021/8/15 16:32
 */
public class Format13 {
    public static void main(String[] args) {
        List<String> generics = null;
        List notGenerics = new ArrayList(10);
        notGenerics.add(new Object());
        notGenerics.add(new Integer(1));
//        generics = notGenerics;
//        String string = generics.get(0);

        System.out.println("-----" + (notGenerics instanceof List));
        System.out.println("-----" + (notGenerics instanceof ArrayList));
        System.out.println("-----" + (generics instanceof List));
        System.out.println("-----" + (generics instanceof ArrayList));

        System.out.println(notGenerics.getClass());
        System.out.println(generics.getClass());

//        System.out.println("------------------------" + string);
        System.out.println("-----------------");
    }
}
