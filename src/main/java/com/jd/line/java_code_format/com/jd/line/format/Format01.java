package com.jd.line.java_code_format.com.jd.line.format;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Format01 class
 * 用于测试类
 *
 * @author rongran
 * @date 2021/8/9 12:39
 */
public class Format01 {
    public static void main(String[] args) {

        String item1 = "a";
        String item2 = null;

        System.out.println("-----item1.equals(item2)----" + item1.equals(item2));
        System.out.println("-----Objects.equals(item2, item1)----" + Objects.equals(item2, item1));
        System.out.println("-----item2.equals(item1)----" + item2.equals(item1));

    }
}
