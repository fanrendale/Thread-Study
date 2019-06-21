package com.book.ch3.knobble_4.inheritabelThreadLocal_test;

/**
 * InheritableThreadLocal类可以让子线程从父线程取得值
 *
 * @Author: xjf
 * @Date: 2019/6/11 17:37
 */
public class Main {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main获取值：" + Tools.localValue.get());
                Thread.sleep(100);
            }

            Thread.sleep(5000);

            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
