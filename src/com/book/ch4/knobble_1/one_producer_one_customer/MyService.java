package com.book.ch4.knobble_1.one_producer_one_customer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xjf
 * @date 2019/6/12 17:03
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void product(){
        try {
            lock.lock();

            //如果有值，则等待
            if (hasValue){
                condition.await();
            }

            System.out.println("打印★");
            hasValue = true;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consume(){
        try {
            lock.lock();

            //如果没有值，则等待
            if (!hasValue){
                condition.await();
            }

            System.out.println("打印☆");
            hasValue = false;
            condition.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
