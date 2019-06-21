package com.book.ch3.knobble_3.threadLocal_test;

/**
 * @Author: xjf
 * @Date: 2019/6/11 15:20
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadName=[" + Thread.currentThread().getName() + "]  i=" + i);
                System.out.println("Tools get value. t1=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
