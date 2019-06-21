package com.book.ch3.knobble_1.producer_customer_test;

/**
 * 消费者
 *
 * @Author: xjf
 * @Date: 2019/6/8 9:27
 */
public class Customer {

    private String lock;

    public Customer(String lock) {
        this.lock = lock;
    }

    public void consume(){
        synchronized (lock){
            ValueObject.customerCount++;
            System.out.println("消费者，第" + ValueObject.customerCount + "次进入");

            try {
                if ("".equals(ValueObject.value)){
                    lock.wait();
                }

                System.out.println("get value=" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
