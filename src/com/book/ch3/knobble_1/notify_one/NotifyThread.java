package com.book.ch3.knobble_1.notify_one;

/**
 * @Author: xjf
 * @Date: 2019/6/7 17:38
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            try {
                //执行几次notify方法，则可以唤醒几个wait状态的线程
                for (int i = 0; i < 2; i++) {
                    lock.notify();
                    System.out.println("已发出了" + (i+1) + "次通知");
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
