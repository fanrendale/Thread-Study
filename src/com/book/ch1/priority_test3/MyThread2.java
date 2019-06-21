package com.book.ch1.priority_test3;

/**
 * @Author: xjf
 * @Date: 2019/5/27 23:05
 */
public class MyThread2 extends Thread {

    private long i;

    public long getI() {
        return i;
    }

    @Override
    public void run() {
        try {
            while (true){
                if (Thread.currentThread().isInterrupted()){
                    throw new InterruptedException();
                }
                i++;
            }
        } catch (InterruptedException e) {
            System.out.println("MyThread2线程停止了！");
            e.printStackTrace();
        }
    }
}
