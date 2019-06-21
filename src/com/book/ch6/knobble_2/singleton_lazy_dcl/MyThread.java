package com.book.ch6.knobble_2.singleton_lazy_dcl;

/**
 * @Author: xjf
 * @Date: 2019/6/17 16:53
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
