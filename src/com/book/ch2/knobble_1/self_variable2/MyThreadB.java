package com.book.ch2.knobble_1.self_variable2;

/**
 * @Author: xjf
 * @Date: 2019/5/28 19:18
 */
public class MyThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public MyThreadB(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        numRef.test("b");
    }
}
