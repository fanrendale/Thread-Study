package com.book.ch4.knobble_1.many_producer_many_customer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xjf
 * @date 2019/6/12 17:46
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void product(){
        try {
            lock.lock();
            while (hasValue){
                System.out.println(Thread.currentThread().getName() + " 有可能连续打印本句。★★");
                condition.await();
            }

            System.out.println(Thread.currentThread().getName() + " 打印★");
            hasValue = true;
            //使用signal方法可能会出现假死
//            condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void consume(){
        try {
            lock.lock();
            while (!hasValue){
                System.out.println(Thread.currentThread().getName() + " 有可能连续打印本句。☆☆");
                condition.await();
            }

            System.out.println(Thread.currentThread().getName() + " 打印☆");
            hasValue = false;
            //使用signal方法可能会出现假死
//            condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
