package com.book.ch1.return_thread;

/**
 * @Author: xjf
 * @Date: 2019/5/25 14:30
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了");
                return;
            }

            System.out.println("当前时间戳: " + System.currentTimeMillis());
        }
    }
}
