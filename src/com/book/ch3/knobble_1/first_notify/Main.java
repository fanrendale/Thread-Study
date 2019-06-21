package com.book.ch3.knobble_1.first_notify;

/**
 * wait和notify会受方法调用先后的影响。如果先调用notify，再调用wait则不会有效果
 *
 * @Author: xjf
 * @Date: 2019/6/7 23:15
 */
public class Main {

    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread1 = new Thread(myRun.runnable1);
        thread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread2 = new Thread(myRun.runnable2);
        thread2.start();
    }
}
