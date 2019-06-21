package com.book.ch3.knobble_1.stack_2_old;

// TODO: 2019/6/9 有疑惑
/**
 * 一个生产者与多个消费者：当一个消费者消费完后执行notify，通知的可能是另一个消费者，而此时该消费者执行remove(0)会报数组越界异常。
 *
 * 解决办法：在消费者和生产者判断是否wait时将if改为while。不过因为也存在会消费者唤醒消费者，可能所有线程都处于waiting状态，导致出现
 * 假死状态。
 *
 * 未进行下面这步修改时，不懂是怎么运行的???
 *
 * 继续解决：将notify更换为notifyAll，将正确执行
 *
 * @Author: xjf
 * @Date: 2019/6/9 17:03
 */
public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        Producer producer = new Producer(myStack);
        Customer customer1 = new Customer(myStack);
        Customer customer2 = new Customer(myStack);
        Customer customer3 = new Customer(myStack);
        Customer customer4 = new Customer(myStack);
        Customer customer5 = new Customer(myStack);

        PThread pThread = new PThread(producer);
        CThread cThread1 = new CThread(customer1);
        CThread cThread2 = new CThread(customer2);
        CThread cThread3 = new CThread(customer3);
        CThread cThread4 = new CThread(customer4);
        CThread cThread5 = new CThread(customer5);

        pThread.start();
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



    }
}
