package com.book.ch6.knobble_1.singleton_0;

/**
 * @Author: xjf
 * @Date: 2019/6/17 11:58
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
