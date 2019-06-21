package com.book.ch1.stop_thread;

/**
 * 使用stop暴力停止线程
 *
 * @Author: xjf
 * @Date: 2019/5/25 14:13
 */
public class Main {

    public static void main(String[] args) {

        /*try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
