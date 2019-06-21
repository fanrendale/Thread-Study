package com.book.ch4.knobble_1.one_producer_one_customer;

/**
 * 使用condition实现一消费者一生产者模式
 *
 * @author xjf
 * @date 2019/6/12 17:17
 */
public class Main {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();

            PThread pThread = new PThread(service);
            pThread.start();

            Thread.sleep(3000);

            CThread cThread = new CThread(service);
            cThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
