package com.book.ch2.knobble_2.sync_out_async;

/**
 * @Author: xjf
 * @Date: 2019/6/3 10:40
 */
public class MyThreadA extends Thread {

    private MyList list;

    public MyThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            list.add("xjf");
        }
    }
}
