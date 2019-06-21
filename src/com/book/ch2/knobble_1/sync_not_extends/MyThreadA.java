package com.book.ch2.knobble_1.sync_not_extends;

/**
 * @Author: xjf
 * @Date: 2019/5/30 17:10
 */
public class MyThreadA extends Thread{

    private Son son;

    public MyThreadA(Son son) {
        this.son = son;
    }

    @Override
    public void run() {
        son.parentMethod();
    }
}
