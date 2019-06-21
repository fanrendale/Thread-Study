package com.book.ch4.knobble_1.use_condition_wait_notify_error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xjf
 * @date 2019/6/12 11:20
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            //如果不加lock.lock(),会出现IllegalMonitorStateException异常，代表无监视器对象
            //调用lock()方法才会获取监视器对象
            lock.lock();

            //等待
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("锁释放了");
        }
    }
}
