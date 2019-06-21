package com.book.ch1.sleep_interrupt;

/**
 * @Author: xjf
 * @Date: 2019/5/25 14:00
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        try {

            for (int i = 0; i < 100000; i++) {
                System.out.println("i = " + (i+1));
            }
            System.out.println("run begin");
            //interrupt是做一个中断标记，当时不会去中断正在运行的线程，当该线程处于阻塞状态时就会进行中断
            //因此，先进行interrupt后，再遇到sleep阻塞时，才会进行中断
            Thread.sleep(200000);
            System.out.println("run end");

        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到了sleep！ 进入catch！");
            e.printStackTrace();
        }
    }
}
