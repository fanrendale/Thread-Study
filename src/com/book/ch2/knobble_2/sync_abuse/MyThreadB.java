package com.book.ch2.knobble_2.sync_abuse;

/**
 * @Author: xjf
 * @Date: 2019/5/31 9:52
 */
public class MyThreadB extends Thread {

    private Task task;


    public MyThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        CommonUtils.startTime2 = System.currentTimeMillis();
        task.doTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
