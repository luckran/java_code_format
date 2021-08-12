package com.jd.line.java_code_format.com.jd.line.format;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * FormatMap04 class
 * 使用Map的方法keySet()/values()/entrySet()返回集合对象时，
 * 不可以对其进行添加元素操作，否则会抛出UnsupportedOperationException异常。
 *
 * @author rongran
 * @date 2021/8/12 20:46
 */
public class FormatMap04 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("a", "a_value");
        map.put("b", "b_value");
        System.out.println("---map----" + map);
        Set<Object> objects = map.keySet();
        Collection<Object> values = map.values();
        Set<Map.Entry<Object, Object>> entries = map.entrySet();

        System.out.println(objects);
        System.out.println(values);
        System.out.println(entries);

        objects.add("jdifji");


    }
}
