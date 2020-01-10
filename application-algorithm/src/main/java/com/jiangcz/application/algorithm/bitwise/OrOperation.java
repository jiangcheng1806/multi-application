package com.jiangcz.application.algorithm.bitwise;

/**
 * 类名称：OrOperation<br>
 * 类描述：<br>
 * 创建时间：2018年07月16日<br>
 *
 * @author jiangcheng
 * @version 1.0.0
 */

public class OrOperation {
    public static void main(String[] args) {
        int a = 129;
        int b = 128;

        System.out.println(" a 的二进制形态是 " + Integer.toBinaryString(a));
        System.out.println(" b 的二进制形态是 " + Integer.toBinaryString(b));
        System.out.println("a or b result is : " + (a|b));
        System.out.println(" a 或 b 的二进制形态是 : " + Integer.toBinaryString(a|b));

    }
}
