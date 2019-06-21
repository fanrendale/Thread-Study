package com.book.ch3.knobble_2.join_test;

/**
 * 使用join方法前的引入
 *
 * @Author: xjf
 * @Date: 2019/6/10 10:47
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
//            Thread.sleep(?);
//            myThread.join();
        System.out.println("我想当ThreadTest对象执行完毕后再执行");
        System.out.println("但上面的sleep值该写多少呢？");
        System.out.println("答案是：根本不能确定:)");
    }
}
