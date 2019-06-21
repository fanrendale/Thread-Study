package com.book.ch6.knobble_5.singleton_static_block;

/**
 * @Author: xjf
 * @Date: 2019/6/18 8:56
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}
