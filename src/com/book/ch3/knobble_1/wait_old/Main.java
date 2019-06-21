package com.book.ch3.knobble_1.wait_old;

/**
 * 在使用wait/notify模式时，需要注意：wait等待的条件发生了变化，也容易造成程序逻辑的混乱
 *
 * 比如该例：两个加法线程等待，接收到通知后会进行移除元素，而只有一个元素时，两个线程都进行移除则会出现索引越界的异常。
 *
 * @Author: xjf
 * @Date: 2019/6/8 9:05
 */
public class Main {

    public static void main(String[] args) {
        try {
            String lock = "lock";

            Add add = new Add(lock);
            Subtract subtract = new Subtract(lock);

            SubtractThread subtractThread1 = new SubtractThread(subtract);
            subtractThread1.setName("subtractThread1");
            subtractThread1.start();

            SubtractThread subtractThread2 = new SubtractThread(subtract);
            subtractThread2.setName("subtractThread2");
            subtractThread2.start();

            Thread.sleep(1000);

            AddThread addThread = new AddThread(add);
            addThread.setName("addThread");
            addThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
