package com.book.ch6.knobble_2.singleton_1;

/**
 * @Author: xjf
 * @Date: 2019/6/17 16:05
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
