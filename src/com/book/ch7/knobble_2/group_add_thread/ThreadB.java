package com.book.ch7.knobble_2.group_add_thread;

/**
 * @Author: xjf
 * @Date: 2019/6/19 10:03
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
