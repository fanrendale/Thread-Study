package com.book.ch2.knobble_2.string_and_sync2;

/**
 * 避免将String设置为“对象监视器”所带来的问题
 * 一般不用String为“对象监视器”
 *
 * 使用new Object()设置为“对象监视器”，该对象不会放入缓存中，可以实现线程持有不同对象的锁
 *
 * @Author: xjf
 * @Date: 2019/6/4 11:21
 */
public class Main {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB();
        threadB.setName("B");
        threadB.start();

    }
}
