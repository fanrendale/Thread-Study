package com.book.ch2.knobble_1.self_variable2;

/**
 * 当线程操作的对象有一个实例变量，可能数据不一致，线程不安全
 * @Author: xjf
 * @Date: 2019/5/28 19:19
 */
public class Main {

    public static void main(String[] args) {
        //创建的两个对象，synchronized是对象锁，在线程执行这两个对象时JVM会创建两个锁，
        // 因此两个线程执行分别执行的，打印表现出的数据为异步的
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

        MyThreadA threadA = new MyThreadA(numRef1);
        threadA.start();

        MyThreadB threadB = new MyThreadB(numRef2);
        threadB.start();
    }
}
