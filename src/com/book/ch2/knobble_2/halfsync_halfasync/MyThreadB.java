package com.book.ch2.knobble_2.halfsync_halfasync;

/**
 * @Author: xjf
 * @Date: 2019/5/31 11:40
 */
public class MyThreadB extends Thread{
    private Task task;

    public MyThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doTask();
    }
}
