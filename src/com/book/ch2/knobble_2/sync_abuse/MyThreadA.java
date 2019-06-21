package com.book.ch2.knobble_2.sync_abuse;

/**
 * @Author: xjf
 * @Date: 2019/5/31 9:52
 */
public class MyThreadA extends Thread {

    private Task task;


    public MyThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        CommonUtils.startTime1 = System.currentTimeMillis();
        task.doTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
