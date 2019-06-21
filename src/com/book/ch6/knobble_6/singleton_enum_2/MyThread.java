package com.book.ch6.knobble_6.singleton_enum_2;

/**
 * @Author: xjf
 * @Date: 2019/6/18 11:13
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getObject().hashCode());
        }
    }
}
