package com.book.ch2.knobble_2.sync_block_string;

/**
 * 测试synchronized(非this对象x)同步代码块：
 * 1）在多个线程持有“对象监视器”为同一个对象的前提下，同一时间只有一个线程可以执行synchronized（非this对象）同步代码块中的代码
 * 2）当持有“对象监视器”为同一个对象的前提下，同一时间只有一个线程可以执行synchronized（非this对象）同步代码块中的代码。
 * 个人理解：当一个同步块的对象监视器设置为同一个对象时（可以是String等任意对象），执行此同步块是同步的。
 *
 *
 * @Author: xjf
 * @Date: 2019/6/3 9:35
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
    }
}
