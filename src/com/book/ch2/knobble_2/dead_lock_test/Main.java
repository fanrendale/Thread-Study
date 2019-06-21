package com.book.ch2.knobble_2.dead_lock_test;

/**
 * 测试线程死锁
 *
 * @Author: xjf
 * @Date: 2019/6/4 14:26
 */
public class Main {

    public static void main(String[] args) {
        try {
            DeadThread deadThread = new DeadThread();

            deadThread.setUsername("a");
            Thread thread1 = new Thread(deadThread);
            thread1.start();

            //实现死锁，该时间不能大于username为a时里面的睡眠时间
            Thread.sleep(200);

            deadThread.setUsername("b");
            Thread thread2 = new Thread(deadThread);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
