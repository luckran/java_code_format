package com.jd.line.javacodeformat.com.jd.line.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Format18 class
 * 使用entrySet遍历Map类集合KV，而不是keySet方式进行遍历。
 * 说明：keySet其实是遍历了2次，一次是转为Iterator对象，另一次是从hashMap中取出key所对应的value。
 * 而entrySet只是遍历了一次就把key和value都放到了entry中，效率更高。
 * 如果是JDK8，使用Map.forEach方法。
 * 正例：values()返回的是V值集合，是一个list集合对象；
 * keySet()返回的是K值集合，是一个Set集合对象；entrySet()返回的是K-V值组合集合。
 *
 * @author rongran
 * @date 2021/8/15 17:04
 */
public class Format18 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(16);
        for (int i = 0; i < 100000; i++) {
            map.put("a" + i, "aa" + i);
            map.put("b" + i, "bb" + i);
            map.put("c" + i, "cc" + i);
            map.put("d" + i, "dd" + i);
        }
        entrySet(map);
        keySet(map);

    }

    private static void entrySet(HashMap map) {
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        long startTime = System.currentTimeMillis();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
//            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("entrySet : " + (endTime - startTime));
    }

    private static void keySet(HashMap map) {
        Iterator<String> it = map.keySet().iterator();

        long startTime = System.currentTimeMillis();
        while (it.hasNext()) {
            String key = it.next();
//            System.out.println(key + "=" + map.get(key));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("keySet : " + (endTime - startTime));
    }

}
