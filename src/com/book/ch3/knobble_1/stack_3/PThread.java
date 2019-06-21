package com.book.ch3.knobble_1.stack_3;

/**
 * @Author: xjf
 * @Date: 2019/6/9 16:59
 */
public class PThread extends Thread {

    private Producer producer;

    public PThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true){
            producer.pushService();
        }
    }
}
