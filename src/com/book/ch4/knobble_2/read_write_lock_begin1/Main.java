package com.book.ch4.knobble_2.read_write_lock_begin1;

/**
 * 测试ReentrantReadWriteLock读写锁的读锁，具有共享性，即多个线程可以同时读取。
 *
 * @Author: xjf
 * @Date: 2019/6/14 9:06
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}
