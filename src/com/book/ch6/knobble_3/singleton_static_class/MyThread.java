package com.book.ch6.knobble_3.singleton_static_class;

/**
 * @Author: xjf
 * @Date: 2019/6/17 17:11
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
