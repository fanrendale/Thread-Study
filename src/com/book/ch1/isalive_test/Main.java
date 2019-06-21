package com.book.ch1.isalive_test;

/**
 * 测试线程状态
 *
 * @Author: xjf
 * @Date: 2019/5/25 9:27
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        System.out.println("myThread start: " + myThread.isAlive());
        myThread.start();
//        myThread.run();

        //不加sleep，end会打印出true，但其实是不正确的。 加了sleep后，end是false
        Thread.sleep(1000);
        System.out.println("myThread end: " + myThread.isAlive());

    }
}
