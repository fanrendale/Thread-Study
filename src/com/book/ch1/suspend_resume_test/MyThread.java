package com.book.ch1.suspend_resume_test;

/**
 * @Author: xjf
 * @Date: 2019/5/26 10:09
 */
public class MyThread extends Thread{
    private long i;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            i++;
        }
    }
}
