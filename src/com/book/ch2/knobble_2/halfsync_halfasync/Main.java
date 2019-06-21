package com.book.ch2.knobble_2.halfsync_halfasync;

/**
 * 同步块里的方法时同步执行，同步块以外的非同步方法是异步执行的
 * @Author: xjf
 * @Date: 2019/5/31 11:42
 */
public class Main {

    public static void main(String[] args) {
        Task task = new Task();

        MyThreadA threadA = new MyThreadA(task);
        threadA.setName("线程1");
        threadA.start();

        MyThreadB threadB = new MyThreadB(task);
        threadB.setName("线程2");
        threadB.start();
    }
}