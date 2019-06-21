package com.book.ch3.knobble_1.notify_hold_lock;

/**
 * 验证notify方法执行后不会释放锁，而是会等当前同步块执行完后释放，然后wait方法才能获取到锁对象
 *
 * @Author: xjf
 * @Date: 2019/6/7 17:08
 */
public class Main {

    public static void main(String[] args) {
        Object lock = new Object();

        WaitThread waitThread = new WaitThread(lock);
        waitThread.setName("WaitThread");
        waitThread.start();

        NotifyThreadA notifyThreadA = new NotifyThreadA(lock);
        notifyThreadA.setName("NotifyThreadA");
        notifyThreadA.start();

        NotifyThreadB notifyThreadB = new NotifyThreadB(lock);
        notifyThreadB.setName("NotifyThreadB");
        notifyThreadB.start();
    }
}
