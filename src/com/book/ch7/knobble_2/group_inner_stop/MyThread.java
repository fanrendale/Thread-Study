package com.book.ch7.knobble_2.group_inner_stop;

/**
 * @Author: xjf
 * @Date: 2019/6/19 17:18
 */
public class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + " 开始死循环了");

        while (!this.isInterrupted()){

        }

        System.out.println("ThreadName=" + Thread.currentThread().getName() + " 结束循环");
    }
}
