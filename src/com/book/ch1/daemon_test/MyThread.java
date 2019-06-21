package com.book.ch1.daemon_test;

/**
 * @Author: xjf
 * @Date: 2019/5/27 23:25
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int i = 0;

            while (true){
                i++;
                Thread.sleep(1000);
                System.out.println("MyThread i="+i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
