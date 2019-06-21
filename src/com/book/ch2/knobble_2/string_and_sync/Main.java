package com.book.ch2.knobble_2.string_and_sync;

/**
 * 注意将String设置为“对象监视器”所带来的问题
 *
 * 因为String常量对被JVM进行常量池缓存，当对象监视器的对象都为"AA"时，
 * 其实是同一个对象，因此在执行时会进行同步阻塞
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
