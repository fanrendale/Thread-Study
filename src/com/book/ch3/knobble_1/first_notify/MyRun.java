package com.book.ch3.knobble_1.first_notify;

/**
 * @Author: xjf
 * @Date: 2019/6/7 23:11
 */
public class MyRun {

    private String lock = new String("");

    private boolean isFirstRunB = false;

    public Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                try {
                    if (isFirstRunB == false){
                        System.out.println("wait() begin");

                        lock.wait();

                        System.out.println("wait() end");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("notify() begin");
                lock.notify();
                System.out.println("notify() end");
                isFirstRunB = false;
            }
        }
    };
}
