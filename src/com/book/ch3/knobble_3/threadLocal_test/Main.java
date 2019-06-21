package com.book.ch3.knobble_3.threadLocal_test;

/**
 * 验证线程变量的隔离性
 *
 * 每个线程都拥有自己的ThreadLocal变量值，是互相隔离的
 *
 * @Author: xjf
 * @Date: 2019/6/11 15:23
 */
public class Main {

    public static void main(String[] args) {

            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();

            threadA.setName("A");
            threadB.setName("B");

            threadA.start();
            threadB.start();
        try {
//            for (int i = 0; i < 100; i++) {
//                Tools.t1.set("ThreadName=[" + Thread.currentThread().getName() + "]  i=" + i);
//                System.out.println("Tools get value. t1=" + Tools.t1.get());
//                Thread.sleep(200);
//            }

            Thread.sleep(2000);
            System.out.println("main ti=" + Tools.t1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
