package com.book.ch3.knobble_1.wait_old;

/**
 * @Author: xjf
 * @Date: 2019/6/8 9:02
 */
public class AddThread extends Thread {

    private Add add;

    public AddThread(Add add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
