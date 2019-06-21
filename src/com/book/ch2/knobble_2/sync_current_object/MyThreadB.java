package com.book.ch2.knobble_2.sync_current_object;

/**
 * @Author: xjf
 * @Date: 2019/5/31 14:10
 */
public class MyThreadB extends Thread {

    private Task task;

    public MyThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.otherMethod();
    }
}
