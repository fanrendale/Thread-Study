package com.book.ch4.knobble_2.read_write_lock_begin3;

/**
 * 测试ReentrantReadWriteLock读写锁的读锁和写锁同时运行，具有同步性，即多个线程可以只能一个一个的获取锁，是同步的。
 *
 * “读写”，“写写”，“写读”是互斥的。“读读”是异步的，非互斥的
 *
 * @Author: xjf
 * @Date: 2019/6/14 9:06
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();


        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();

        Thread.sleep(1000);

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
    }
}
