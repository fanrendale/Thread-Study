package com.book.ch7.knobble_1.status_test3;

/**
 * @Author: xjf
 * @Date: 2019/6/19 9:27
 */
public class MyObject {

    private String lock = new String();

    public void testMethod(){
        synchronized (lock){
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
