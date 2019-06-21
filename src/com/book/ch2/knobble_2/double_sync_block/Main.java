package com.book.ch2.knobble_2.double_sync_block;

/**
 * 当一个线程访问一个对象的synchronized同步代码块时，
 * 其他的线程访问同一对象的其他同步代码块时，会阻塞，只能依次执行。
 * 说明synchronized使用的“对象监视器”只有一个。
 * @Author: xjf
 * @Date: 2019/5/31 13:52
 */
public class Main {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        MyThreadA threadA = new MyThreadA(service);
        MyThreadB threadB = new MyThreadB(service);

        threadA.start();
        threadB.start();

    }
}
