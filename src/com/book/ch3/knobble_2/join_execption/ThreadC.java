package com.book.ch3.knobble_2.join_execption;

/**
 * @Author: xjf
 * @Date: 2019/6/10 11:29
 */
public class ThreadC extends Thread{

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        System.out.println("执行C线程");
        threadB.interrupt();
    }
}
