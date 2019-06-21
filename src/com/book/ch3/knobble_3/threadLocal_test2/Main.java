package com.book.ch3.knobble_3.threadLocal_test2;

/**
 * 验证ThreadLocal变量的线程隔离性
 *
 * 两个线程设置时间后获取的是两个不同值，说明ThreadLocal变量具有线程隔离性
 *
 * @Author: xjf
 * @Date: 2019/6/11 15:43
 */
public class Main {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadB b = new ThreadB();
        b.start();
    }
}
