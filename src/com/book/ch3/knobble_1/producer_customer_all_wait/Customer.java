package com.book.ch3.knobble_1.producer_customer_all_wait;

/**
 * 消费者
 *
 * @Author: xjf
 * @Date: 2019/6/9 9:40
 */
public class Customer {

    private String lock;

    public Customer(String lock) {
        this.lock = lock;
    }

    public void getValue(){
        synchronized (lock){
            try {
                //此处必须要使用while，即是同时要满足接收到通知，并且公共值为""
                while ("".equals(ValueObject.value)){
                    System.out.println("消费者: " + Thread.currentThread().getName() + " waiting了★");
                    lock.wait();
                }

                System.out.println("消费者：" + Thread.currentThread().getName() +" runnable了");
                ValueObject.value = "";
//                lock.notify();

                //解决因同类唤醒造成的“假死”
                lock.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
