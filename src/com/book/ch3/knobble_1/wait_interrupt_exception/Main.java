package com.book.ch3.knobble_1.wait_interrupt_exception;

/**
 * 测试处于wait状态的线程，如果再去调用interrupt方法，会出现InterruptedException异常
 *
 * @Author: xjf
 * @Date: 2019/6/7 17:24
 */
public class Main {

    public static void main(String[] args) {
        try {
            Object lock = new Object();

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Service service = new Service();
                    service.testMethod(lock);
                }
            },"A");

            thread.start();

            Thread.sleep(3000);

            //执行interrupt，会出现异常
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
