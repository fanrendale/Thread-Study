package com.book.ch1.priority_test3;

/**
 * 不同的线程优先级下，测试哪个线程运行更快
 * @Author: xjf
 * @Date: 2019/5/27 23:05
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread1.setPriority(Thread.NORM_PRIORITY-3);
        thread2.setPriority(Thread.NORM_PRIORITY+3);

        thread1.start();
        thread2.start();

        Thread.sleep(2000);

        thread1.interrupt();
        thread2.interrupt();

        System.out.println("MyThread1 i=" + thread1.getI());
        System.out.println("MyThread2 i=" + thread2.getI());
    }

}
