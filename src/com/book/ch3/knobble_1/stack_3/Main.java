package com.book.ch3.knobble_1.stack_3;


/**
 * 多个生产者一个消费者的情况。
 *
 * @Author: xjf
 * @Date: 2019/6/9 17:03
 */
public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        Producer producer1 = new Producer(myStack);
        Producer producer2 = new Producer(myStack);
        Producer producer3 = new Producer(myStack);
        Producer producer4 = new Producer(myStack);
        Producer producer5 = new Producer(myStack);

        PThread pThread1 = new PThread(producer1);
        PThread pThread2 = new PThread(producer2);
        PThread pThread3 = new PThread(producer3);
        PThread pThread4 = new PThread(producer4);
        PThread pThread5 = new PThread(producer5);

        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();

        Customer customer = new Customer(myStack);
        CThread cThread = new CThread(customer);
        cThread.start();
    }
}
