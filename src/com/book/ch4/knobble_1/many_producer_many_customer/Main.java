package com.book.ch4.knobble_1.many_producer_many_customer;

/**
 * 使用condition实现：多个消费者，多个生产者
 *
 * 会出现连续await，是因为程序中使用了同一个condition，signalAll唤醒了同类
 *
 * @author xjf
 * @date 2019/6/12 17:53
 */
public class Main {

    public static void main(String[] args) {
        MyService service = new MyService();

        PThread[] pThreads = new PThread[10];
        CThread[] cThreads = new CThread[10];

        for (int i = 0; i < 10; i++) {
            pThreads[i] = new PThread(service);
            cThreads[i] = new CThread(service);

            pThreads[i].start();
            cThreads[i].start();
        }
    }
}
