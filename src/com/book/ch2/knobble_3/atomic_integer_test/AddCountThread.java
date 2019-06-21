package com.book.ch2.knobble_3.atomic_integer_test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: xjf
 * @Date: 2019/6/6 11:04
 */
public class AddCountThread extends Thread {

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
