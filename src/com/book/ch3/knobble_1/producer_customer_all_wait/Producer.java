package com.book.ch3.knobble_1.producer_customer_all_wait;

/**
 * 生产者
 * @Author: xjf
 * @Date: 2019/6/9 9:36
 */
public class Producer {

    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void setValue(){
        synchronized (lock){
            try {
                //此处必须要使用while，即是同时要满足接收到通知，并且公共值不为""
                while (!"".equals(ValueObject.value)){
                    System.out.println("生产者：" + Thread.currentThread().getName() + " waiting了☆");
                    lock.wait();
                }

                String value = System.currentTimeMillis() +"_" + System.nanoTime();
                System.out.println("生产者：" + Thread.currentThread().getName() + " runnable了");
                ValueObject.value = value;
//                lock.notify();

                //解决因同类唤醒造成的“假死”
                lock.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
