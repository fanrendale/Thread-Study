package com.book.ch3.knobble_1.producer_customer_all_wait;

/**
 * 多个生产者和多个消费者可能出现“假死状态”
 *
 * 即当生产者或消费者运行完之后进行notify，既可能唤醒的是同类，也可能是异类。比如消费者可能唤醒的是消费者，也可能是生产者。
 * 如果唤醒的是同类，则可能会所有的线程都处于WAITING状态，导致程序不能继续执行下去，出现“假死”状态
 *
 * 解决办法：将生产者和消费者类的notify()更换为notifyAll()
 *
 * @Author: xjf
 * @Date: 2019/6/9 9:48
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        String lock = "咖啡";

        Producer producer = new Producer(lock);
        Customer customer = new Customer(lock);

        PThread[] pThreads = new PThread[2];
        CThread[] cThreads = new CThread[2];

        for (int i = 0; i < 2; i++) {
            pThreads[i] = new PThread(producer);
            cThreads[i] = new CThread(customer);

            pThreads[i].setName("生产者" + (i+1) + "号");
            cThreads[i].setName("消费者" + (i+1) + "号");

            pThreads[i].start();
            cThreads[i].start();
        }

        Thread.sleep(5000);

        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
        }
    }
}
