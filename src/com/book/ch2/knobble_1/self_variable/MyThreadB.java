package com.book.ch2.knobble_1.self_variable;

/**
 * @Author: xjf
 * @Date: 2019/5/28 12:45
 */
public class MyThreadB extends Thread {

    private HasSelfPrivateNum privateNum;

    public MyThreadB(HasSelfPrivateNum privateNum) {
        this.privateNum = privateNum;
    }

    @Override
    public void run() {
        privateNum.test("b",22);
    }
}
