package com.book.ch2.knobble_2.sync_more_object_static_one_lock;

/**
 * 一、验证synchronized加在静态方法上是在加锁在类上，
 * 在不同的对象中调用不同的同步方法时是同步执行的，说明两个对象的“对象监视器”是同一个
 *
 * 二、synchronized(class)代码块也是将锁加在类上，跟synchronized加在静态方法上是一致的
 *      比如：synchronized(Service.class)
 *
 * @Author: xjf
 * @Date: 2019/6/4 10:46
 */
public class Main {

    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();

        MyThreadA threadA = new MyThreadA(service1);
        threadA.setName("A");
        threadA.start();

        MyThreadB threadB = new MyThreadB(service2);
        threadB.setName("B");
        threadB.start();
    }
}
