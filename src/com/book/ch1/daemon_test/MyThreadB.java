package com.book.ch1.daemon_test;

/**
 * @Author: xjf
 * @Date: 2019/5/27 23:25
 */
public class MyThreadB extends Thread {

    @Override
    public void run() {
        try {
            int i = 0;

            while (true){
                i++;
                Thread.sleep(1000);
                if (i > 10){
                    throw new InterruptedException();
                }
                System.out.println("MyThreadB i="+i);
            }
        } catch (InterruptedException e) {
            System.out.println("MyThreadB线程停止");
            e.printStackTrace();
        }
    }
}
