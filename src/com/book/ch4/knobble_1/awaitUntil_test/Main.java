package com.book.ch4.knobble_1.awaitUntil_test;

/**
 * condition的awaitUntil方法：会在指定的时间停止等待，然后继续向下执行。如果在指定的时间前有其他线程进行唤醒，
 * 则会提前退出等待状态
 *
 * @Author: xjf
 * @Date: 2019/6/13 17:26
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        AwaitThread awaitThread = new AwaitThread(service);
        awaitThread.setName("awaitThread");
        awaitThread.start();

        Thread.sleep(2000);

        SignalThread signalThread = new SignalThread(service);
        signalThread.setName("signalThread");
        signalThread.start();
    }
}
