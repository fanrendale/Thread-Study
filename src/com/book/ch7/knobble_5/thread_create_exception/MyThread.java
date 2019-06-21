package com.book.ch7.knobble_5.thread_create_exception;

/**
 * @Author: xjf
 * @Date: 2019/6/20 11:34
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        throw new IndexOutOfBoundsException("gg");
        /*String username = null;
        System.out.println(username.hashCode());*/
    }
}
