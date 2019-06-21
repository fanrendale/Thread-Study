package com.book.ch2.knobble_2.sync_current_object;

/**
 * @Author: xjf
 * @Date: 2019/5/31 14:07
 */
public class Task {

    public void doLongTimeMethod(){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized method. current threadName=" + Thread.currentThread().getName() +
                        "  i=" + (i+1));
            }
        }
    }

    public void otherMethod(){
        synchronized (this){
            System.out.println("===================otherMethod run! threadName=" + Thread.currentThread().getName());

        }
    }
}
