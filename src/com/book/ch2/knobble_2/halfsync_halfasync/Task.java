package com.book.ch2.knobble_2.halfsync_halfasync;

/**
 * @Author: xjf
 * @Date: 2019/5/31 11:07
 */
public class Task {

    public void doTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("no synchronized execute. threadName=" + Thread.currentThread().getName() +
                    " i=" + (i+1));
        }

        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized execute. threadName=" + Thread.currentThread().getName() +
                        " i=" + (i+1));
            }
        }
    }
}
