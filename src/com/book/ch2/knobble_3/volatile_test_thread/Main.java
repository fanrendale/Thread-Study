package com.book.ch2.knobble_3.volatile_test_thread;

/**
 * 测试volatile不具备同步性，也就不具备原子性
 *
 * 对于用volatile修饰的变量，JVM虚拟机只是保证从主内存加在到线程工作内存的值是最新的，但无法保证原子性
 * 对于多个线程访问同一个实例变量还是需要加锁同步
 *
 * @Author: xjf
 * @Date: 2019/6/6 10:43
 */
public class Main {

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];

        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }

        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
