package com.book.ch3.knobble_2.join_test2;

/**
 * 在主方法中使用join方法，join之后的语句会在执行的子线程结束之后主方法再继续执行
 *
 * 方法join具有使线程排队运行的作用，有些类似同步的运行效果。join与synchronized的区别是：
 * join在内部使用wait()方法进行等待，而synchronized关键字使用的是“对象监视器”原理作为同步。
 *
 * @Author: xjf
 * @Date: 2019/6/10 10:47
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        //等待子线程执行完毕
        myThread.join();

        System.out.println("这句话执行是当myThread执行完之后再打印的");
    }
}
