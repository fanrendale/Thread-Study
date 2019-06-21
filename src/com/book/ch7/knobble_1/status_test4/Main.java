package com.book.ch7.knobble_1.status_test4;

/**
 * 验证线程的BLOCKED状态
 *
 * @Author: xjf
 * @Date: 2019/6/19 9:34
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyObject myObject = new MyObject();

        MyThreadA threadA = new MyThreadA(myObject);
        threadA.start();

        Thread.sleep(1000);

        MyThreadB threadB = new MyThreadB(myObject);
        threadB.start();

        Thread.sleep(1000);
        System.out.println("在main方法中threadB的状态：" + threadB.getState());
    }
}
