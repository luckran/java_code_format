package com.jd.line.javacodeformat.com.jd.line.format;

import java.util.Collections;
import java.util.HashMap;

/**
 * FormatMapEmpty05 class
 * Collections类返回的对象，如：emptyList()/singletonList()等都是immutable list，不可对其进行添加或者删除元素的操作。
 * 反例：如果查询无结果，返回Collections.emptyList()空集合对象，调用方一旦进行了添加元素的操作，就会触发UnsupportedOperationException异常。
 *
 * @author rongran
 * @date 2021/8/12 21:07
 */
public class FormatMapEmpty05 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>(2);
        map.put("a", "a_value");
        map.put("b", "b_value");
        System.out.println("---map----" + map);

//        Collections.emptyMap()==-----=-=-=-=-=;;;;;;


    }
}
