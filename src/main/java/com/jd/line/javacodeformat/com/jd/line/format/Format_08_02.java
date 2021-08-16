package com.jd.line.javacodeformat.com.jd.line.format;

/**
 * Format_08_02 class
 *
 * @author rongran
 * @date 2021/8/16 11:24
 */
public class Format_08_02 {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(String param) {
        System.out.println("------param---" + param);
        switch (param) {
            // 肯定不是进入这里
            case "sth":
                System.out.println("it's sth");
                break;
            // 也不是进入这里
            case "null":
                System.out.println("it's null");
                break;
            // 也不是进入这里
            default:
                System.out.println("default");
        }
        System.out.println("------------------");
    }

}
