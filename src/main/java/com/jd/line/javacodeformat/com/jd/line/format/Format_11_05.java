package com.jd.line.javacodeformat.com.jd.line.format;

import java.util.Random;

/**
 * Format_11_05 class
 * 注意 Math.random() 这个方法返回是double类型，注意取值的范围 0≤x<1（能够取到零值，注意除零异常），
 * 如果想获取整数类型的随机数，不要将x放大10的若干倍然后取整，
 * 直接使用Random对象的nextInt或者nextLong方法。
 *
 * @author rongran
 * @date 2021/8/16 16:27
 */
public class Format_11_05 {
    public static void main(String[] args) {
        Double math = Math.random();
        System.out.println(math);

        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
        int i1 = random.nextInt(500);
        System.out.println(i1);
    }
}
