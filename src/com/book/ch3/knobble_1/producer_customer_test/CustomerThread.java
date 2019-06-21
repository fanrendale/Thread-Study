package com.book.ch3.knobble_1.producer_customer_test;

/**
 * @Author: xjf
 * @Date: 2019/6/8 9:31
 */
public class CustomerThread extends Thread {

    private Customer customer;

    public CustomerThread(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                customer.consume();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
