package com.book.ch3.knobble_1.wait_has_param_method;

import com.book.util.TimeUtil;

/**
 * 加上了时间的wait，在等待时间内如果没有线程将其唤醒，则当前线程会时间到了之后自动唤醒，
 * 也可以在等待时间内有其他线程唤醒
 *
 * @Author: xjf
 * @Date: 2019/6/7 17:54
 */
public class MyRunnable {
    static private Object lock = new Object();
    /**
     * wait的runnable
     */
    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                try {
                    System.out.println("wait() begin. time=" + TimeUtil.convertToString(System.currentTimeMillis()));

                    //加上了时间的wait，在等待时间内如果没有线程将其唤醒，则当前线程会时间到了之后自动唤醒
                    lock.wait(5000);

                    System.out.println("wait() end. time=" + TimeUtil.convertToString(System.currentTimeMillis()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    /**
     * notify的runnable
     */
    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("notify() begin. time=" + TimeUtil.convertToString(System.currentTimeMillis()));

                lock.notify();

                System.out.println("notify() end. time=" + TimeUtil.convertToString(System.currentTimeMillis()));
            }
        }
    };

    public static void main(String[] args) {
        try {
            Thread thread1 = new Thread(runnable1);
            thread1.start();

            Thread.sleep(3000);

            //线程2进行通知，提前唤醒线程1
            Thread thread2 = new Thread(runnable2);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
