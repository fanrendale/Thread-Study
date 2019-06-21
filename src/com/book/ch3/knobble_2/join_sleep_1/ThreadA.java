package com.book.ch3.knobble_2.join_sleep_1;

/**
 * @Author: xjf
 * @Date: 2019/6/10 14:06
 */
public class ThreadA extends Thread {

    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        synchronized (threadB){
            try {
                threadB.start();
                //不会释放锁
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
