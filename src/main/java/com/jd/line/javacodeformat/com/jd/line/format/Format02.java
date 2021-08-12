package com.jd.line.javacodeformat.com.jd.line.format;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Format02 class
 * 在使用java.util.stream.Collectors类的toMap()方法转为Map集合时，一定要使用含有参数类型为BinaryOperator，
 * 参数名为mergeFunction的方法，否则当出现相同key值时会抛出IllegalStateException异常。
 * 说明：参数mergeFunction的作用是当出现key重复时，自定义对value的处理策略。
 * @author rongran
 * @date 2021/8/12 20:03
 */
public class Format02 {

    public static void main(String[] args) {
        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version", 12.10));
        pairArrayList.add(new Pair<>("version", 12.19));
        pairArrayList.add(new Pair<>("version", 6.28));


        Map<String, Double> map = pairArrayList.stream().collect(
                // 生成的map集合中只有一个键值对：{version=6.28}
                Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v2));
        System.out.println("---map---" + map);

        Map<String, Double> map1 = pairArrayList.stream().collect(
                Collectors.toMap(Pair::getKey, Pair::getValue));
        System.out.println("---map1---" + map1);
    }
}
