package com.book.ch4.knobble_1.use_condition_wait_notify_ok;

import com.book.util.TimeUtil;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xjf
 * @date 2019/6/12 11:40
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println("开始await的时间：" + TimeUtil.convertToString(System.currentTimeMillis()));
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("await,释放锁了");
        }
    }

    public void signal(){

        try {
            lock.lock();
            System.out.println("signal的时间：" + TimeUtil.convertToString(System.currentTimeMillis()));
            condition.signal();
        } finally {
            lock.unlock();
            System.out.println("signal,释放锁了");
        }
    }
}
