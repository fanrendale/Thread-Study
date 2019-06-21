package com.book.ch3.knobble_1.stack_1;

/**
 * 一生产者与一消费者：操作栈
 *
 * @Author: xjf
 * @Date: 2019/6/9 17:03
 */
public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        Producer producer = new Producer(myStack);
        Customer customer = new Customer(myStack);

        PThread pThread = new PThread(producer);
        CThread cThread = new CThread(customer);

        pThread.start();
        cThread.start();
    }
}
