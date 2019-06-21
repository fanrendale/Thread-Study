package com.book.ch1.sleep_interrupt;

/**
 * @Author: xjf
 * @Date: 2019/5/25 13:35
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run-----------start");
            Thread.sleep(5000);
            System.out.println("run-----------end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch，线程的是否处于停止状态：" + this.isInterrupted());
            e.printStackTrace();
        }

    }
}
