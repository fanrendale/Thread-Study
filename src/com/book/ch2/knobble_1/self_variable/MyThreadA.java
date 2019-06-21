package com.book.ch2.knobble_1.self_variable;

/**
 * @Author: xjf
 * @Date: 2019/5/28 12:45
 */
public class MyThreadA extends Thread {

    private HasSelfPrivateNum privateNum;

    public MyThreadA(HasSelfPrivateNum privateNum) {
        this.privateNum = privateNum;
    }

    @Override
    public void run() {
        privateNum.test("a",10);
    }
}
