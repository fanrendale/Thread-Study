package com.book.ch3.knobble_1.producer_customer_test;

/**
 * 生产者
 *
 * @Author: xjf
 * @Date: 2019/6/8 9:24
 */
public class Producer {
    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void product(){
        synchronized (lock){
            ValueObject.producerCount++;
            System.out.println("生产者，第" + ValueObject.producerCount + "次进入");

            try {
                if (!"".equals(ValueObject.value)){
                    lock.wait();
                }

                String value = System.currentTimeMillis() + "----" + System.nanoTime();
                ValueObject.value = value;
                System.out.println("set value=" + value);
                lock.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
