package com.book.ch3.knobble_1.producer_customer_all_wait;

/**
 * @Author: xjf
 * @Date: 2019/6/9 9:43
 */
public class PThread extends Thread {

    private Producer producer;

    public PThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
//        try {
            while (true){
//                Thread.sleep(1000);
                producer.setValue();

            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
