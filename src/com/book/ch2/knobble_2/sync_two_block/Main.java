package com.book.ch2.knobble_2.sync_two_block;

/**
 * 测试synchronized加在静态方法和一般方法上是加的不同的锁，
 * 加在静态方法上是类锁，在一般方法上是对象锁。
 * print1和print2方法是类锁，print3是对象锁，因为加的锁不同，所以运行时会出现print3方法与print1、print2异步执行
 *
 * @Author: xjf
 * @Date: 2019/6/4 10:08
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();

        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");
        threadC.start();
    }
}
