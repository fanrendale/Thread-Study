package com.book.ch3.knobble_1.wait_interrupt_exception;

/**
 * @Author: xjf
 * @Date: 2019/6/7 17:21
 */
public class Service {

    public void testMethod(Object lock){
        synchronized (lock){
            try {
                System.out.println("wait() begin. ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("wait() end. ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("出现异常了。因为处于wait状态的线程，又执行了interrupt方法");
                e.printStackTrace();
            }
        }
    }
}
