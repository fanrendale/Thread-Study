package com.book.ch2.knobble_2.sync_static_method;

/**
 * 将synchronized加在静态方法上，是对该类进行加锁，加在非静态方法上是对对象加锁。
 * 对类加锁也是同步执行方法
 *
 * @Author: xjf
 * @Date: 2019/6/4 8:54
 */
public class Main {

    public static void main(String[] args) {
        MyThreadA threadA = new MyThreadA();
        threadA.setName("A");
        threadA.start();

        MyThreadB threadB = new MyThreadB();
        threadB.setName("B");
        threadB.start();
    }
}
