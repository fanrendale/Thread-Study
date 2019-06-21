package com.book.ch3.knobble_1.wait_old;

/**
 * @Author: xjf
 * @Date: 2019/6/8 9:04
 */
public class SubtractThread extends Thread{

    private Subtract subtract;

    public SubtractThread(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
