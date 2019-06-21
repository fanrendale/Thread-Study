package com.book.ch2.knobble_2.sync_method_or_block;

/**
 * 当线程调用同一个对象的同一个synchronized同步方法或同步块时，呈现同步效果
 * 也就是对象监视器为同一个对象。
 *
 * @Author: xjf
 * @Date: 2019/6/3 23:01
 */
public class Main {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        Service service = new Service();

        MyThreadA threadA  = new MyThreadA(service,object);
        threadA.setName("A");
        threadA.start();

        MyThreadB threadB = new MyThreadB(object);
        threadB.setName("B");
        threadB.start();

    }
}
