package com.book.ch7.knobble_7.thead_exception_move;

/**
 * @Author: xjf
 * @Date: 2019/6/21 9:53
 */
public class MyThread extends Thread {

    private String num = "a";

    public MyThread() {
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印：numInt=" + numInt);
    }
}
