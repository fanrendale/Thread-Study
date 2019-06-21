package com.book.ch4.knobble_1.await_uninterruptily_test;

/**
 * 使用condition的await，遇到中断标记时会抛出异常
 * 使用condition的awaitUninterruptibly，遇到中断标记时不会抛出异常
 *
 * @Author: xjf
 * @Date: 2019/6/13 16:37
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        Thread.sleep(1000);

        a.interrupt();
    }
}
