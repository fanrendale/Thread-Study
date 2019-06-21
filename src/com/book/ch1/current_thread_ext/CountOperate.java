package com.book.ch1.current_thread_ext;

/**
 * @author xjf
 * @date 2019/5/24 17:21
 */
public class CountOperate extends Thread {

     public CountOperate() {
        System.out.println("CountOperate-------start");
        System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
        System.out.println("this.getName() : " + this.getName());
        System.out.println("CountOperate-------end");
    }

    @Override
    public void run() {
        System.out.println("run--------------start");
        System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
        System.out.println("this.getName() : " + this.getName());
        System.out.println("run--------------end");

    }
}
