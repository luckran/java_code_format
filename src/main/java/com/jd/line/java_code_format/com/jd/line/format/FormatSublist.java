package com.jd.line.java_code_format.com.jd.line.format;

import java.util.ArrayList;
import java.util.List;

/**
 * FormatSublist class
 * ArrayList的subList结果不可强转成ArrayList，否则会抛出 ClassCastException异常：java.util.RandomAccessSubList cannot be cast to java.util.ArrayList。
 * 说明：subList()返回的是ArrayList的内部类SubList，并不是 ArrayList本身，而是ArrayList 的一个视图，对于SubList的所有操作最终会反映到原列表上。
 * @author rongran
 * @date 2021/8/12 20:27
 */
public class FormatSublist {

    public static void main(String[] args) {
        ArrayList<Object> ob = new ArrayList<>();
        ob.add("a");
        ob.add("b");
        ob.add("c");
        ob.add("d");
        List<Object> obSub = ob.subList(0, 2);
        System.out.println("---obSub---" + obSub);
        System.out.println("---ob---" + ob);
        obSub.set(0, "1212");
        System.out.println("---change obSub---" + ob);

        ArrayList<Object> obSub1 = (ArrayList<Object>) obSub;
        Object[] objects = obSub.toArray();
        System.out.println("---objects---" + objects);
    }

}
