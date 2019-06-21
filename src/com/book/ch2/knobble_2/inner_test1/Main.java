package com.book.ch2.knobble_2.inner_test1;

/**
 * 测试内部类和synchronized的使用
 *
 * 该例的两个方法持有不同的“对象监视器”，将会异步调用
 * @Author: xjf
 * @Date: 2019/6/4 16:35
 */
public class Main {

    public static void main(String[] args) {
        OutClass.Inner inner = new OutClass.Inner();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        }, "A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        }, "B");

        threadA.start();
        threadB.start();
    }
}
