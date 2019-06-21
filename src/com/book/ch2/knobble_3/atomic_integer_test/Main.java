package com.book.ch2.knobble_3.atomic_integer_test;

/**
 * 测试原子类AtomicInteger
 *
 * @Author: xjf
 * @Date: 2019/6/6 11:07
 */
public class Main {

    public static void main(String[] args) {
        AddCountThread addCountThread = new AddCountThread();

        Thread thread1 = new Thread(addCountThread);
        thread1.start();

        Thread thread2 = new Thread(addCountThread);
        thread2.start();

        Thread thread3 = new Thread(addCountThread);
        thread3.start();

        Thread thread4 = new Thread(addCountThread);
        thread4.start();

        Thread thread5 = new Thread(addCountThread);
        thread5.start();
    }
}
