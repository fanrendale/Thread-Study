package com.book.ch2.knobble_3.volatile_test_thread;

/**
 * @Author: xjf
 * @Date: 2019/6/6 10:41
 */
public class MyThread extends Thread {

     volatile private static int count;

    /**
     * 添加synchronized能使用该方法具有原子性，并且是加在static方法上的，则是对MyThread类进行了加锁
     * 多个线程运行该方法都会是同步的
     */
    synchronized private static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }

        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
