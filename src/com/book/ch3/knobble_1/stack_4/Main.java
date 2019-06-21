package com.book.ch3.knobble_1.stack_4;


/**
 * 多个生产者多个消费者的情况。
 *
 * @Author: xjf
 * @Date: 2019/6/9 17:03
 */
public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        //多个生产者
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

        //多个消费者
        Customer customer1 = new Customer(myStack);
        Customer customer2 = new Customer(myStack);
        Customer customer3 = new Customer(myStack);
        Customer customer4 = new Customer(myStack);
        Customer customer5 = new Customer(myStack);
        Customer customer6 = new Customer(myStack);

        CThread cThread1 = new CThread(customer1);
        CThread cThread2 = new CThread(customer2);
        CThread cThread3 = new CThread(customer3);
        CThread cThread4 = new CThread(customer4);
        CThread cThread5 = new CThread(customer5);
        CThread cThread6 = new CThread(customer6);

        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
        cThread6.start();
    }
}
