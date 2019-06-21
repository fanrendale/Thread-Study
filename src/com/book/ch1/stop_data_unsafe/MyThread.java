package com.book.ch1.stop_data_unsafe;

/**
 * @Author: xjf
 * @Date: 2019/5/25 14:25
 */
public class MyThread extends Thread{

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b","BB");
    }
}
