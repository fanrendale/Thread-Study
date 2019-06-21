package com.book.ch4.knobble_2.read_write_lock_begin2;

/**
 * 测试ReentrantReadWriteLock读写锁的写锁锁，具有同步性，即多个线程可以只能一个一个的获取锁，是同步的。
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
