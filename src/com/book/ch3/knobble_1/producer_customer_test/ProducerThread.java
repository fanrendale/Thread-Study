package com.book.ch3.knobble_1.producer_customer_test;

/**
 * @Author: xjf
 * @Date: 2019/6/8 9:30
 */
public class ProducerThread extends Thread {

    private Producer producer;

    public ProducerThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        try {
            while (true){
                producer.product();
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
