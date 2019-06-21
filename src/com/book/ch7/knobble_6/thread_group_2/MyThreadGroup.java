package com.book.ch7.knobble_6.thread_group_2;

/**
 * @Author: xjf
 * @Date: 2019/6/21 9:38
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("执行了uncaughtException方法");
        this.interrupt();
    }
}
