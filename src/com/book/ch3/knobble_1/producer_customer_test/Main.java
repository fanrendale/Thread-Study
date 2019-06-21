package com.book.ch3.knobble_1.producer_customer_test;

/**
 * 一生产者一消费者：操作值
 *
 * @Author: xjf
 * @Date: 2019/6/8 9:32
 */
public class Main {

    public static void main(String[] args) {
        try {
            String lock = "lock";

            Producer producer = new Producer(lock);
            Customer customer = new Customer(lock);

            ProducerThread producerThread = new ProducerThread(producer);
            producerThread.start();

            Thread.sleep(2000);

            CustomerThread customerThread = new CustomerThread(customer);
            customerThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
