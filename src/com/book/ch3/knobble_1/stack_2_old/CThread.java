package com.book.ch3.knobble_1.stack_2_old;

/**
 * @Author: xjf
 * @Date: 2019/6/9 17:00
 */
public class CThread extends Thread {

    private Customer customer;

    public CThread(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        while (true){

            customer.popService();
        }
    }
}
