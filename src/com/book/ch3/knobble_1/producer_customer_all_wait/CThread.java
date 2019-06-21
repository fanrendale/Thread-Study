package com.book.ch3.knobble_1.producer_customer_all_wait;

/**
 * @Author: xjf
 * @Date: 2019/6/9 9:48
 */
public class CThread extends Thread {

    private Customer customer;

    public CThread(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
//        try {
            while (true){
//                Thread.sleep(2000);
                customer.getValue();

            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
